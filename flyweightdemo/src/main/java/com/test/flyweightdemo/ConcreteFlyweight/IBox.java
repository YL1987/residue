package com.test.flyweightdemo.ConcreteFlyweight;

import com.test.flyweightdemo.Flyweight.AbstractBox;

/**
 * 作者：yangyouqiao on 2017/11/23 18:21
 * 功能：
 */

/**
 *
 *@author YangYQ
 *created at 2017/11/23 下午6:22
 *
 * 继承抽象享元类，在具体享元类中为内部状态提供存储空间。
 * 通常可以结合单例模式来设计具体享元类，为每一个具体享元类提供唯一的享元对象
 */

public class IBox extends AbstractBox {
    @Override
    public String getShape() {
        return "I";
    }
}
