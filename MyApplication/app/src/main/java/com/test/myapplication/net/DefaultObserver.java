package com.test.myapplication.net;

import android.text.TextUtils;
import android.widget.Toast;

import com.google.gson.JsonParseException;
import com.jakewharton.retrofit2.adapter.rxjava2.HttpException;
import com.test.myapplication.R;
import com.test.myapplication.Utils.LogUtils;
import com.test.myapplication.Utils.ToastUtils;
import com.test.myapplication.engine.AppConstant;
import com.test.myapplication.engine.BaseImpl;
import com.test.myapplication.engine.BasicResponse;

import org.json.JSONException;

import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.text.ParseException;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import static com.test.myapplication.net.DefaultObserver.ExceptionReason.CONNECT_ERROR;
import static com.test.myapplication.net.DefaultObserver.ExceptionReason.CONNECT_TIMEOUT;
import static com.test.myapplication.net.DefaultObserver.ExceptionReason.PARSE_ERROR;
import static com.test.myapplication.net.DefaultObserver.ExceptionReason.UNKNOWN_ERROR;


/**
 * @author YangYQ
 *         created at 2017/9/20 下午12:02
 */
public abstract class DefaultObserver<T extends BasicResponse> implements Observer<T> {

    private BaseImpl mBaseImpl;
    //  Activity 是否在执行onStop()时取消订阅
    private boolean isAddInStop = false;

    public DefaultObserver(BaseImpl baseImpl) {
        mBaseImpl = baseImpl;
    }

    public DefaultObserver(BaseImpl baseImpl, boolean isShowLoading) {
        mBaseImpl = baseImpl;
        if (isShowLoading) {
            mBaseImpl.showProgress("正在加载...");
        }
    }

    @Override
    public void onSubscribe(Disposable d) {
        if (isAddInStop) {    //  在onStop中取消订阅
            mBaseImpl.addRxStop(d);
        } else { //  在onDestroy中取消订阅
            mBaseImpl.addRxDestroy(d);
        }
    }

    @Override
    public void onNext(T response) {
        mBaseImpl.dismissProgress();

        if (response.getStatus().equals(AppConstant.REQUESTCODESUCCESS)) {
            onSuccess(response);
        } else {
            onFail(response);
        }
    }

    @Override
    public void onError(Throwable e) {
        LogUtils.e("Retrofit", e.getMessage());
        mBaseImpl.dismissProgress();
        if (e instanceof HttpException) {     //   HTTP错误
            onException(ExceptionReason.BAD_NETWORK);
        } else if (e instanceof ConnectException
                || e instanceof UnknownHostException) {   //   连接错误
            onException(CONNECT_ERROR);
        } else if (e instanceof InterruptedIOException) {   //  连接超时
            onException(CONNECT_TIMEOUT);
        } else if (e instanceof JsonParseException
                || e instanceof JSONException
                || e instanceof ParseException) {   //  解析错误
            onException(PARSE_ERROR);
        } else {
            onException(UNKNOWN_ERROR);
        }
    }

    @Override
    public void onComplete() {
    }

    /**
     * 请求成功
     *
     * @param response 服务器返回的数据
     */
    abstract public void onSuccess(T response);

    /**
     * 服务器返回数据，但响应码不为100000
     *
     * @param response 服务器返回的数据
     */
    public void onFail(T response) {
        String message = response.getMsg();
        if (TextUtils.isEmpty(message)) {
            ToastUtils.show(R.string.response_return_error);
        } else {
            ToastUtils.show(message);
        }
    }

    /**
     * 请求异常
     *
     * @param reason
     */
    public void onException(ExceptionReason reason) {
        switch (reason) {
            case CONNECT_ERROR:
                ToastUtils.show(R.string.connect_error, Toast.LENGTH_SHORT);
                break;

            case CONNECT_TIMEOUT:
                ToastUtils.show(R.string.connect_timeout, Toast.LENGTH_SHORT);
                break;

            case BAD_NETWORK:
                ToastUtils.show(R.string.bad_network, Toast.LENGTH_SHORT);
                break;

            case PARSE_ERROR:
                ToastUtils.show(R.string.parse_error, Toast.LENGTH_SHORT);
                break;

            case UNKNOWN_ERROR:
            default:
                ToastUtils.show(R.string.unknown_error, Toast.LENGTH_SHORT);
                break;
        }
    }

    /**
     * 请求网络失败原因
     */
    public enum ExceptionReason {
        /**
         * 解析数据失败
         */
        PARSE_ERROR,
        /**
         * 网络问题
         */
        BAD_NETWORK,
        /**
         * 连接错误
         */
        CONNECT_ERROR,
        /**
         * 连接超时
         */
        CONNECT_TIMEOUT,
        /**
         * 未知错误
         */
        UNKNOWN_ERROR,
    }
}
