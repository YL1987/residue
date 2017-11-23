package com.test.flyweightdemo.FlyweightFactory;

import com.test.flyweightdemo.ConcreteFlyweight.JBox;
import com.test.flyweightdemo.Flyweight.ExtrinsicStateBox;

import java.util.Hashtable;

/**
 * 作者：yangyouqiao on 2017/11/23 19:27
 * 功能：
 */

public class ExtrinsicStateBoxFactory {
    private static class SingletonHolder {
        private static final ExtrinsicStateBoxFactory INSTANCE = new ExtrinsicStateBoxFactory();
    }
    public static final ExtrinsicStateBoxFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }
    private static Hashtable<String, ExtrinsicStateBox> sHashtable;
    private ExtrinsicStateBoxFactory() {
        sHashtable = new Hashtable<>();
        ExtrinsicStateBox jBox = new JBox();
        sHashtable.put("J", jBox);
    }
    public ExtrinsicStateBox getBox(String key) {
        return sHashtable.get(key);
    }
}
