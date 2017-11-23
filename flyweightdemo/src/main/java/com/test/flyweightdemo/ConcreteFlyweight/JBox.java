package com.test.flyweightdemo.ConcreteFlyweight;

import com.test.flyweightdemo.Flyweight.ExtrinsicStateBox;

/**
 * 作者：yangyouqiao on 2017/11/23 19:29
 * 功能：
 */

public class JBox extends ExtrinsicStateBox {
    @Override
    public String getShape() {
        return "J";
    }
}
