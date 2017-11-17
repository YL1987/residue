package com.test.myapplication.engine;

import static com.test.myapplication.App.EXTERNAL_RELEASE;

public class AppConstant {
    public static final int CALENDAR_CODE = 7;
    public static final int SENSORS_CODE = 8;
    public static final int LOCATION_CODE = 9;
    private static final int CALL_LOG_CODE = 2;
    private static final int AUDIO_CODE = 6;
    private static final int READ_CONTACTS_CODE = 10;

    public static boolean isBroker = false;
    //接收到推送时候跳转消息界面
    public static boolean isMsg = false;
    //记录融云未读消息数
    public static int unReadCount = 0;
    public static String HOST = (EXTERNAL_RELEASE) ? "http://odpro.sevendoor.cn/api/v1/" : "https://oddev.sevendoor.cn/api/v1/";
    public static String RONG = (EXTERNAL_RELEASE) ? "http://odpro.sevendoor.cn/rong/token" : "https://oddev.sevendoor.cn/rong/token";
    public static String WAP = (EXTERNAL_RELEASE) ? "http://odpro.sevendoor.cn/" : "http://oddev.7door.cc/";


    public static String LOGGINGSTATUS = "loginStatus";//登录状态
    public static String REQUESTCODESUCCESS = "100000";//请求成功


    /**
     * jump_url
     */
    public static String HomeActUrl = "/onedoor/main/home";
    public static String LoginActUrl = "/onedoor/login";
    /**
     * Prompt
     */
    public static String CANNOTBEEMPTY = "手机号不能为空";
    /**
     * PreferencesUtils
     */
    public static String LOGINTOKEN = "login_token";
    public static String CITYID = "login_cityid";


}
