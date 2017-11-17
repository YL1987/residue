package com.test.myapplication;

import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.test.myapplication.Utils.LogUtils;
import com.test.myapplication.Utils.PreferencesUtils;
import com.test.myapplication.Utils.Utils;
import com.test.myapplication.engine.AppConstant;
import com.test.myapplication.engine.BaseAct;
import com.test.myapplication.engine.Urls;
import com.test.myapplication.entity.CItyIdEntity;
import com.test.myapplication.net.DefaultObserver;
import com.test.myapplication.net.IdeaApi;
import com.test.myapplication.param.CityIdParam;
import com.test.myapplication.service.LocationService;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

@Route(path = "onedoor/main")
public class MainActivity extends BaseAct {
    private static Disposable mDisposable;

    @Override
    public void widgetClick(View v) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {

    }

    @Override
    public void setListener() {
//        LocationService locationService = new LocationService(getApplicationContext());
//        locationService.registerListener(new BDLocationListener() {
//            @Override
//            public void onReceiveLocation(BDLocation bdLocation) {
//                App.CITYID = bdLocation.getCity();
//                CityIdParam cityIdParam = new CityIdParam();
//                cityIdParam.setCity_name(bdLocation.getCity());
//                LogUtils.d(cityIdParam.toString());
//                IdeaApi.getApiService()
//                        .requestCityId(Urls.GET_ADDRESS_CODE, cityIdParam.toString())
//                        .subscribeOn(Schedulers.io())
//                        .observeOn(AndroidSchedulers.mainThread())
//                        .subscribe(new DefaultObserver<CItyIdEntity>(MainActivity.this, false) {
//                            @Override
//                            public void onSuccess(CItyIdEntity response) {
//                                PreferencesUtils.putInt(Utils.getContext(), AppConstant.CITYID, response.getData().getCity_id());
//
//                            }
//                        });
//            }
//        });
    }

    @Override
    public void doBusiness() {
        delayToJump();
    }

    void delayToJump() {
        Observable.timer(5000, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        mDisposable = d;
                    }

                    @Override
                    public void onNext(Long aLong) {
                        if (PreferencesUtils.getBoolean(Utils.getContext(), AppConstant.LOGGINGSTATUS)) {
                            ARouter.getInstance().build(AppConstant.HomeActUrl).navigation();
                        } else {
                            ARouter.getInstance().build(AppConstant.LoginActUrl).navigation();
                        }
                        finish();
                    }

                    @Override
                    public void onError(Throwable e) {
                        cancel();
                    }

                    @Override
                    public void onComplete() {
                        cancel();
                    }
                });

    }

    public static void cancel() {
        if (mDisposable != null && !mDisposable.isDisposed()) {
            mDisposable.dispose();
        }
    }

    public interface IRxNext {
        void doNext(long number);
    }
}
