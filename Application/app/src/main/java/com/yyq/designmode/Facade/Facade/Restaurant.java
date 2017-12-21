package com.yyq.designmode.Facade.Facade;

import com.yyq.designmode.Facade.SubSystem.BuyVegetable;
import com.yyq.designmode.Facade.SubSystem.CookVegetable;
import com.yyq.designmode.Facade.SubSystem.CutVegetable;

/**
 * 作者：yangyouqiao on 2017/11/24 13:54
 * 功能：
 */

public class Restaurant {
    private final BuyVegetable mBuyVegetable;
    private final CutVegetable mCutVegetable;
    private final CookVegetable mCookVegetable;

    public Restaurant() {
        mBuyVegetable = new BuyVegetable();
        mCutVegetable = new CutVegetable();
        mCookVegetable = new CookVegetable();
    }

    public void eat() {
        mBuyVegetable.buy();
        mCutVegetable.cut();
        mCookVegetable.cook();
    }
}
