package com.yyq.designmode.Bridge.RefineAbstraction;

import android.util.Log;

import com.yyq.designmode.Bridge.Abstraction.Clothes;

/**
 * 作者：yangyouqiao on 2017/11/24 15:58
 * 功能：
 */

public class XXLClothes extends Clothes {
    @Override
    public void getColor() {
        String s = null;
        if (color != null) {
            s = color.dyeing();
        }
        Log.i("XXLClothes", s + "XXL号的衣服");
    }
}
