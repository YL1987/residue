package com.test.flyweightdemo.Flyweight;

import android.util.Log;

/**
 * 作者：yangyouqiao on 2017/11/23 19:28
 * 功能：
 */

public  abstract  class ExtrinsicStateBox {
    public abstract String getShape();
    public void display(String color) {
        Log.i("ExtrinsicStateBox","方块形状：" + this.getShape() + " 颜色：" + color);
    }
}
