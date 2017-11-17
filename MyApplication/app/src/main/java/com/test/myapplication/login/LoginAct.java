package com.test.myapplication.login;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.alibaba.android.arouter.utils.TextUtils;
import com.jakewharton.rxbinding2.view.RxView;
import com.test.myapplication.App;
import com.test.myapplication.R;
import com.test.myapplication.Utils.PreferencesUtils;
import com.test.myapplication.Utils.ToastUtils;
import com.test.myapplication.Utils.Utils;
import com.test.myapplication.engine.AppConstant;
import com.test.myapplication.engine.BaseAct;
import com.test.myapplication.engine.Urls;
import com.test.myapplication.entity.GetCodeEntity;
import com.test.myapplication.entity.LoginEntity;
import com.test.myapplication.net.CusInterceptor;
import com.test.myapplication.net.DefaultObserver;
import com.test.myapplication.net.IdeaApi;
import com.test.myapplication.param.GetCodeParam;
import com.test.myapplication.param.LoginParam;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

@Route(path = "/onedoor/login")
public class LoginAct extends BaseAct {


    @BindView(R.id.kanfang)
    RadioButton mKanfang;
    @BindView(R.id.jinjiren)
    RadioButton mJinjiren;
    @BindView(R.id.rg_selecthouse)
    RadioGroup mRgSelecthouse;
    @BindView(R.id.login_phone)
    EditText mLoginPhone;
    @BindView(R.id.getCode)
    Button mGetCode;
    @BindView(R.id.phone)
    LinearLayout mPhone;
    @BindView(R.id.code)
    EditText mCode;
    @BindView(R.id.login)
    Button mLogin;
    @BindView(R.id.tvTips)
    TextView mTvTips;
    @BindView(R.id.c_agree_content)
    TextView mCAgreeContent;
    @BindView(R.id.cLayoutAgree)
    LinearLayout mCLayoutAgree;
    @BindView(R.id.fast_login)
    LinearLayout mFastLogin;
    @BindView(R.id.weixin)
    LinearLayout mWeixin;
    @BindView(R.id.weibo)
    LinearLayout mWeibo;
    @BindView(R.id.fast_login2)
    LinearLayout mFastLogin2;
    @BindView(R.id.agree_content)
    TextView mAgreeContent;
    @BindView(R.id.bLayoutAgree)
    LinearLayout mBLayoutAgree;
    @BindView(R.id.login_fast_login)
    LinearLayout mLoginFastLogin;
    @BindView(R.id.activity_login)
    LinearLayout mActivityLogin;

    private int count = 60;

    @Override
    public void widgetClick(View v) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {
    }

    @Override
    public void setListener() {
        RxView.clicks(mLogin)
                .throttleFirst(1, TimeUnit.SECONDS)
                .map(new Function<Object, Boolean>() {
                    @Override
                    public Boolean apply(@NonNull Object o) throws Exception {
                        return TextUtils.isEmpty(mLoginPhone.getText().toString()) ? true : false;
                    }
                })
                .subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(@NonNull Boolean aBoolean) throws Exception {
                        if (aBoolean) {
                            ToastUtils.show(AppConstant.CANNOTBEEMPTY);
                        } else {
                            LoginParam loginParam = new LoginParam();
                            loginParam.setType("login");
                            loginParam.setIdent("client");
                            loginParam.setMobile(mLoginPhone.getText().toString());
                            loginParam.setVerify_code(mCode.getText().toString());
                            loginParam.setMethod("mobile");
                            IdeaApi.getApiService()
                                    .requestLogin(Urls.LOGIN, loginParam.toString())
                                    .subscribeOn(Schedulers.io())
                                    .observeOn(AndroidSchedulers.mainThread())
                                    .subscribe(new DefaultObserver<LoginEntity>(LoginAct.this, true) {

                                        @Override
                                        public void onSuccess(LoginEntity response) {
                                            App.setToken(response.getData().getApp_token());
                                            CusInterceptor.TOKEN = response.getData().getApp_token();
                                            PreferencesUtils.putBoolean(Utils.getContext(), AppConstant.LOGGINGSTATUS, true);
                                            ARouter.getInstance().build(AppConstant.HomeActUrl).navigation();
                                            finish();
                                        }
                                    });
                        }
                    }
                });
        RxView.clicks(mGetCode)
                .map(new Function<Object, Boolean>() {
                    @Override
                    public Boolean apply(@NonNull Object o) throws Exception {
                        return TextUtils.isEmpty(mLoginPhone.getText().toString()) ? true : false;
                    }
                })
                .subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(@NonNull Boolean aBoolean) throws Exception {
                        if (aBoolean) {
                            ToastUtils.show(AppConstant.CANNOTBEEMPTY);
                        } else {
                            GetCodeParam mGetCodeParm = new GetCodeParam();
                            mGetCodeParm.setType("login");
                            mGetCodeParm.setMobile(mLoginPhone.getText().toString());
                            Observable.interval(0, 1, TimeUnit.SECONDS)//设置0延迟，每隔一秒发送一条数据
                                    .take(count + 1) //设置循环11次
                                    .map(new Function<Long, Object>() {
                                        @Override
                                        public Object apply(@NonNull Long aLong) throws Exception {
                                            return count - aLong;
                                        }
                                    })
                                    .doOnSubscribe(new Consumer<Disposable>() {
                                        @Override
                                        public void accept(@NonNull Disposable disposable) throws Exception {
                                            mGetCode.setEnabled(false);//在发送数据的时候设置为不能点击
                                            mGetCode.setBackgroundColor(Color.GRAY);//背景色设为灰色
                                        }
                                    })
                                    .observeOn(AndroidSchedulers.mainThread())//操作UI主要在UI线程
                                    .subscribe(new Observer<Object>() {

                                        @Override
                                        public void onSubscribe(Disposable d) {

                                        }

                                        @Override
                                        public void onNext(Object o) {
                                            mGetCode.setText("剩余时间" + (Long) o + "秒");
                                            mGetCode.setTextColor(Color.WHITE);
                                        }

                                        @Override
                                        public void onError(Throwable e) {
                                            e.printStackTrace();
                                        }

                                        @Override
                                        public void onComplete() {
                                            mGetCode.setText("获取验证码");//数据发送完后设置为原来的文字
                                            mGetCode.setEnabled(true);
                                            mGetCode.setTextColor(Color.BLACK);
                                            mGetCode.setBackgroundColor(Color.parseColor("#f97e7e"));
                                        }
                                    });
                            IdeaApi.getApiService()
                                    .requestGetCode(Urls.GETCODE, mGetCodeParm.toString())
                                    .subscribeOn(Schedulers.io())
                                    .observeOn(AndroidSchedulers.mainThread())
                                    .subscribe(new DefaultObserver<GetCodeEntity>(LoginAct.this, false) {
                                        @Override
                                        public void onSuccess(GetCodeEntity response) {
                                            mCode.setText(response.getData().getVerify_code());
                                        }
                                    });

                        }

                    }
                });
    }

    @Override
    public void doBusiness() {

    }

}
