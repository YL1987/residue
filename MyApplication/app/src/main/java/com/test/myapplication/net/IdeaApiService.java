package com.test.myapplication.net;


import com.test.myapplication.engine.Urls;
import com.test.myapplication.entity.CItyIdEntity;
import com.test.myapplication.entity.GetCodeEntity;
import com.test.myapplication.entity.HomeLatestEntity;
import com.test.myapplication.entity.LoginEntity;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Url;

/**
 *
 *@author YangYQ
 *created at 2017/9/20 下午12:03
 */

public interface IdeaApiService {
    /**
     * 网络请求超时时间毫秒
     */
    int DEFAULT_TIMEOUT = 20000;

//    String HOST = "http://gank.io/";
//    String API_SERVER_URL = HOST + "api/data/";


    /**
     *
     * @param url
     * @param data 登录接口
     * @return
     */
    @FormUrlEncoded
    @POST
    Observable<LoginEntity> requestLogin(@Url String url, @Field("data") String data);
    /**
     *
     * @param url
     * @param data 获取验证码1001
     * @return
     */
    @FormUrlEncoded
    @POST
    Observable<GetCodeEntity> requestGetCode(@Url String url, @Field("data") String data);


    @FormUrlEncoded
    @POST
    Observable<HomeLatestEntity> requestHomeRec(@Url String url, @Field("data") String data);
    @FormUrlEncoded
    @POST
    Observable<CItyIdEntity> requestCityId(@Url String url, @Field("data") String data);


    @FormUrlEncoded
    @POST(Urls.LOGIN)
    Observable<String> login(@Field("broker_phone") String broker_phone, @Field("verify_code") String verify_code, @Field("invite_code") String invite_code);


    /**
     * 公共的请求方法
     *
     * @param url
     * @param data
     * @return
     */
    @FormUrlEncoded
    @POST
    Observable<String> request(@Url String url, @Field("data") String data);


    @Headers({
            "Content Type : image/*;charset=utf-8"
    })
    @Multipart
    @POST
    Observable<String> uploadFile(@Url String usl, @Part("description") RequestBody description, @Part MultipartBody.Part file);


    @GET("")
    Observable<ResponseBody> downLoadImage(@Url String url);
}
