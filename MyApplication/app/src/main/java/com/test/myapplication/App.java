package com.test.myapplication;

import android.app.Application;
import android.app.Service;
import android.os.Vibrator;

import com.alibaba.android.arouter.launcher.ARouter;
import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.mapapi.SDKInitializer;
import com.test.myapplication.Utils.PreferencesUtils;
import com.test.myapplication.Utils.Utils;
import com.test.myapplication.engine.AppConstant;
import com.test.myapplication.service.LocationService;

/**
 * 作者：yangyouqiao on 2017/9/21 15:12
 * 功能：
 */

public class App extends Application {
    public static final boolean EXTERNAL_RELEASE = BuildConfig.ENVIRONMENT;
    public LocationService locationService;
    public Vibrator mVibrator;
    public static String CITYID = "北京";

    public static void setToken(String token) {
//        if (!TextUtils.equals(token, token)) {
//            //TODO 如果和当前用户不一致，退出应用 EventBus.getDefault().post("退出");
//        }
        PreferencesUtils.putString(Utils.getContext(), AppConstant.LOGINTOKEN, token);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        ARouter.openLog();
        ARouter.openDebug();
        ARouter.init(this);
        /**
         * 初始化定位sdk，建议在Application中创建
         */
        locationService = new LocationService(getApplicationContext());
        mVibrator = (Vibrator) getApplicationContext().getSystemService(Service.VIBRATOR_SERVICE);
        SDKInitializer.initialize(getApplicationContext());
        locationService.registerListener(new BDLocationListener() {
            @Override
            public void onReceiveLocation(BDLocation bdLocation) {
                CITYID = bdLocation.getCity();
            }
        });
        locationService.start();
    }
}
