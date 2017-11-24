package com.yyq.designmode.Decorator.ConcreteDecorator;

import android.util.Log;

import com.yyq.designmode.Decorator.Component.Gift;
import com.yyq.designmode.Decorator.Decorator.GiftPackaging;

/**
 * 作者：yangyouqiao on 2017/11/24 11:37
 * 功能：
 */

public class SimplePackaging extends GiftPackaging {
    public SimplePackaging(Gift gift) {
        super(gift);
    }

    @Override
    public void packaging() {
        super.packaging();
        addColorSheet();
    }

    private void addColorSheet() {
        Log.i("SimplePackaging", "包彩纸");
    }
}
