package com.yyq.designmode.Decorator.Decorator;

import com.yyq.designmode.Decorator.Component.Gift;

/**
 * 作者：yangyouqiao on 2017/11/24 11:34
 * 功能：
 */

public abstract class GiftPackaging extends Gift {
    private Gift gift;

    public GiftPackaging(Gift gift) {
        this.gift = gift;
    }


    public void packaging() {
        gift.packaging();
    }
}
