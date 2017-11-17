package com.test.myapplication.net;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.test.myapplication.engine.Urls;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author YangYQ
 *         created at 2017/9/20 下午12:02
 */

public class IdeaApi {
    public static String TOKEN = "";
    private Retrofit retrofit;
    private static IdeaApiService service;

    private IdeaApi() {
       /* HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);*/
//        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").serializeNulls().create();

        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(OKHttpManager.getOkHttpClint())
                .baseUrl(Urls.WEB_SERVER_PATH)
                .build();
        service = retrofit.create(IdeaApiService.class);
    }

    //  创建单例
    private static class SingletonHolder {
        private static final IdeaApi INSTANCE = new IdeaApi();
    }

    public static IdeaApiService getApiService() {
        return SingletonHolder.INSTANCE.service;
    }


//
//
//    /**
//     * 网络请求工具 需要上传Json 等参数  返回后台数据Bean
//     *
//     * @param url
//     * @param
//     * @param tClass
//     * @param <T>    要解析成的Bean类型
//     * @return
//     */
//    public static <T> Observable<T> jsonBean(String url, Object obj, final Class<T> tClass) {
//
//        url = BASE_URL + url;
//        String json = new Gson().toJson(obj);
//        return sInter.request(url, json)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .compose(new CusTransformer())
//                .flatMap(new Func1<String, Observable<T>>() {
//                    @Override
//                    public Observable<T> call(String s) {
//                        return Observable.just(FastJsonUtils.json2Bean(s, tClass));
//                    }
//                });
//    }
//
//    /**
//     * 网络请求工具 需要上传Json 等参数  返回后台数据Bean
//     *
//     * @param url
//     * @param
//     * @param tClass
//     * @param <T>    要解析成的Bean类型
//     * @return
//     */
//    public static <T> Observable<List<T>> jsonList(String url, Object obj, final Class<T> tClass) {
//        url = BASE_URL + url;
//        String json = new Gson().toJson(obj);
//        return sInter.request(url, json)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .compose(new CusTransformer())
//                .flatMap(new Func1<String, Observable<List<T>>>() {
//                    @Override
//                    public Observable<List<T>> call(String s) {
//                        return Observable.just(FastJsonUtils.json2BeanList(s, tClass));
//                    }
//                });
//    }
//
//
//    /**
//     * 网络请求工具 返回后台数据List<Bean>
//     *
//     * @param url
//     * @param params
//     * @param tClass
//     * @param <T>    要解析成的Bean类型
//     * @return
//     */
//    public static <T> Observable<List<T>> list(String url, Map<String, String> params, final Class<T> tClass) {
//        url =BASE_URL + url;
//        JSONObject jsonObject = new JSONObject(params);
//        String data = jsonObject.toString();
//        return sInter.request(url, data)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .compose(new CusTransformer())
//                .flatMap(new Func1<String, Observable<List<T>>>() {
//                    @Override
//                    public Observable<List<T>> call(String s) {
//                        return Observable.just(FastJsonUtils.json2BeanList(s, tClass));
//                    }
//                });
//    }
//
//
//    /**
//     * 网络请求工具 上传Json串
//     *
//     * @param url
//     * @param
//     * @param tClass
//     * @param <T>    要解析成的Bean类型
//     * @return
//     */
//    public static <T> Observable<List<T>> toJson(String url, Object obj, final Class<T> tClass) {
//        url =BASE_URL + url;
//
//        String json = new Gson().toJson(obj);
//        return sInter.request(url, json)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .compose(new CusTransformer())
//                .flatMap(new Func1<String, Observable<List<T>>>() {
//                    @Override
//                    public Observable<List<T>> call(String s) {
//                        return Observable.just(FastJsonUtils.json2BeanList(s, tClass));
//                    }
//                });
//    }
//
//
//    /**
//     * 网络请求工具,返回后台数据json串
//     *
//     * @param url
//     * @param params
//     * @return 返回后台数据json串(已经过滤，只剩data部分)
//     */
//    public static Observable<String> json(String url, Map<String, String> params) {
//        url = BASE_URL + url;
//        JSONObject jsonObject = new JSONObject(params);
//        String data = jsonObject.toString();
//
//        LogUtils.guo("data: "+data);
//        return sInter.request(url, data)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .compose(new CusTransformer());
//    }

}
