package com.test.myapplication.Utils;

import android.content.Context;


/**
 *
 *@author YangYQ
 *created at 2017/9/20 下午12:01
 * desc  : Utils初始化相关
 */
public class Utils {

    private static Context context;

    private Utils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 初始化工具类
     *
     * @param context 上下文
     */
    public static void init(Context context) {
        Utils.context = context.getApplicationContext();
    }

    /**
     * 获取ApplicationContext
     *
     * @return ApplicationContext
     */
    public static Context getContext() {
        if (context != null) return context;
        throw new NullPointerException("should init first");
    }
}