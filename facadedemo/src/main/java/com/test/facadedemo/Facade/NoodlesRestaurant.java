package com.test.facadedemo.Facade;

import com.test.facadedemo.SubSystem.BuyVegetable;
import com.test.facadedemo.SubSystem.CookVegetable;

/**
 * 作者：yangyouqiao on 2017/11/23 20:24
 * 功能：
 */

public class NoodlesRestaurant extends AbstractFacade {

    private final BuyVegetable mBuyVegetable;
    private final CookVegetable mCookVegetable;

    public NoodlesRestaurant() {
        mBuyVegetable = new BuyVegetable();
        mCookVegetable = new CookVegetable();
    }

    @Override
    public void eat() {
        mBuyVegetable.buy();
        mCookVegetable.cook();
    }
}
