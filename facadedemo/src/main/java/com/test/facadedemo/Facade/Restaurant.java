package com.test.facadedemo.Facade;

import com.test.facadedemo.SubSystem.BuyVegetable;
import com.test.facadedemo.SubSystem.CookVegetable;
import com.test.facadedemo.SubSystem.CutVegetable;

/**
 * 作者：yangyouqiao on 2017/11/23 20:22
 * 功能：
 */

/**
 * 外观角色中可以知道相关的多个子系统的功能和责任，客户端调用它的方法，它再传递给相应的子系统对象处理
 *
 * @author YangYQ
 *         created at 2017/11/23 下午8:22
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
