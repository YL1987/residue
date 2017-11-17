package com.test.myapplication.net;

import com.test.myapplication.Utils.AppUtils;
import com.test.myapplication.Utils.PreferencesUtils;
import com.test.myapplication.Utils.Utils;
import com.test.myapplication.engine.AppConstant;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by gjj on 2017/6/22.
 * <p>
 * 共同的请求头和请求参数设置
 */

public class CusInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        HttpUrl httpUrl = request.url().newBuilder()
                .addQueryParameter("app_version", String.valueOf(AppUtils.getVersionCode(Utils.getContext())))
                .build();
        Request.Builder builder = request.newBuilder();
        builder.addHeader("Authorization", "Bearer " + TOKEN);
        request = builder.url(httpUrl).build();

        return chain.proceed(request);
    }

    public static String TOKEN = PreferencesUtils.getString(Utils.getContext(), AppConstant.LOGINTOKEN);

}
