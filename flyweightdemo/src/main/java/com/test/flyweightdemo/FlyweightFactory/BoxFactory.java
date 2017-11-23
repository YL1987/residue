package com.test.flyweightdemo.FlyweightFactory;

import com.test.flyweightdemo.ConcreteFlyweight.IBox;
import com.test.flyweightdemo.Flyweight.AbstractBox;

import java.util.Hashtable;

/**
 * 作者：yangyouqiao on 2017/11/23 18:52
 * 功能：
 */

/**
 * @author YangYQ
 *         created at 2017/11/23 下午6:53
 *         <p>
 *         创建并管理享元对象，将各种具体享元类存储到一个享元池中，
 *         享元池一般为“键值对”集合，可以结合工厂模式进行设计。当用户请求一个具体享元对象时，
 *         享元池中如果保存的有就直接返回给用户，如果没有就创建该享元对象返回给用户并存储到享元池中
 */
public class BoxFactory {
    private static class SingletonHolder {
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    public static final BoxFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static Hashtable<String, AbstractBox> sHashtable;

    private BoxFactory() {
        sHashtable = new Hashtable<>();
        AbstractBox iBox = new IBox();
        sHashtable.put("I", iBox);

    }

    public AbstractBox getBox(String key) {
        return sHashtable.get(key);
    }
}
