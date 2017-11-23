package com.test.flyweightdemo.Flyweight;

import android.util.Log;

/**
 * 作者：yangyouqiao on 2017/11/23 18:17
 * 功能：
 */

/**
 * 抽象享元类：通常是接口或抽象类，抽象享元类中声明了具体享元类公共方法，
 * 这些方法可以向外界提供享元对象的内部数据（内部状态），同时也可以通过这些方法来设置外部数据（外部状态）
 */
public abstract class AbstractBox {
    public abstract String getShape();

    public void display() {
        Log.i("AbstractBox", "方块形状：" + this.getShape());
    }
}
