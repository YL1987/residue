package com.test.myapplication.net;

import android.annotation.SuppressLint;

import com.test.myapplication.App;
import com.test.myapplication.Utils.LogUtils;
import com.test.myapplication.Utils.NetWorkUtils;
import com.test.myapplication.Utils.PreferencesUtils;
import com.test.myapplication.Utils.Utils;
import com.test.myapplication.engine.AppConstant;

import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by gjj on 2017/7/4.
 * 配置OKHttp
 */

public class OKHttpManager {

    public static CusInterceptor interceptor = new CusInterceptor();
    private static OkHttpClient client;


    public static OkHttpClient getOkHttpClint() {
        if (client == null) {
            File cacheFile = new File(Utils.getContext().getCacheDir(), "onedoor_cache");
            Cache cache = new Cache(cacheFile, 1024 * 1024 * 100); //100Mb
            OkHttpClient.Builder okHttpClientBuidler = new OkHttpClient().newBuilder();
            okHttpClientBuidler.connectTimeout(IdeaApiService.DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS);
            okHttpClientBuidler.readTimeout(IdeaApiService.DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS);
            okHttpClientBuidler.sslSocketFactory(createSSLSocketFactory());
            okHttpClientBuidler.hostnameVerifier(new TrustAllHostnameVerifier());
            okHttpClientBuidler.addInterceptor(interceptor);// 设置共同的请求参数和请求头等信息
            okHttpClientBuidler.cache(cache);
            client = okHttpClientBuidler.build();
        } else {
            CusInterceptor.TOKEN = PreferencesUtils.getString(Utils.getContext(), AppConstant.LOGINTOKEN);
        }
        return client;
    }


    /**
     * 默认信任所有的证书
     * TODO 最好加上证书认证，主流App都有自己的证书
     *
     * @return
     */
    @SuppressLint("TrulyRandom")
    private static SSLSocketFactory createSSLSocketFactory() {

        SSLSocketFactory sSLSocketFactory = null;

        try {
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, new TrustManager[]{new TrustAllManager()}, new SecureRandom());
            sSLSocketFactory = sc.getSocketFactory();
        } catch (Exception e) {
        }

        return sSLSocketFactory;
    }

    private static class TrustAllManager implements X509TrustManager {
        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType)
                throws CertificateException {
        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType)

                throws CertificateException {
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    private static class TrustAllHostnameVerifier implements HostnameVerifier {
        @Override
        public boolean verify(String hostname, SSLSession session) {
            return true;
        }
    }
    class HttpCacheInterceptor implements Interceptor {

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            if (!NetWorkUtils.isConnectedByState(Utils.getContext())) {  //没网强制从缓存读取
                request = request.newBuilder()
                        .cacheControl(CacheControl.FORCE_CACHE)
                        .build();
                LogUtils.d("Okhttp", "no network");
            }


            Response originalResponse = chain.proceed(request);
            if (NetWorkUtils.isConnectedByState(Utils.getContext())) {
                //有网的时候读接口上的@Headers里的配置，你可以在这里进行统一的设置
                String cacheControl = request.cacheControl().toString();
                return originalResponse.newBuilder()
                        .header("Cache-Control", cacheControl)
                        .header("Authorization", "Bearer " + CusInterceptor.TOKEN)
                        .removeHeader("Pragma")
                        .build();
            } else {
                return originalResponse.newBuilder()
                        .header("Cache-Control", "public, only-if-cached, max-stale=2419200")
                        .header("Authorization", "Bearer " + CusInterceptor.TOKEN)
                        .removeHeader("Pragma")
                        .build();
            }
        }
    }
}
