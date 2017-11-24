package com.yyq.designmode.Decorator.ConcreteComponent;

import android.util.Log;

import com.yyq.designmode.Decorator.Component.Gift;

/**
 * 作者：yangyouqiao on 2017/11/24 11:33
 * 功能：
 */

public class BirthdayGift extends Gift {
    @Override
    public void packaging() {
        Log.d("BirthdayGift", "包装盒");
    }
}
