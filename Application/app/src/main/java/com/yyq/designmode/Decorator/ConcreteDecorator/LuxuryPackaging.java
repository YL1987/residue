package com.yyq.designmode.Decorator.ConcreteDecorator;

import android.util.Log;

import com.yyq.designmode.Decorator.Component.Gift;
import com.yyq.designmode.Decorator.Decorator.GiftPackaging;

/**
 * 作者：yangyouqiao on 2017/11/24 11:39
 * 功能：
 */

public class LuxuryPackaging extends GiftPackaging {
    public LuxuryPackaging(Gift gift) {
        super(gift);
    }

    @Override
    public void packaging() {
        super.packaging();
        addColorSheet();
        addRibbon();
        addCard();
        addGiftBox();
    }

    private void addColorSheet() {
        Log.i("LuxuryPackaging", "包彩纸");
    }

    private void addRibbon() {
        Log.i("LuxuryPackaging", "加彩带");
    }

    private void addCard() {
        Log.i("LuxuryPackaging", "加贺卡");
    }

    private void addGiftBox() {
        Log.i("LuxuryPackaging", "加礼盒");
    }
}
