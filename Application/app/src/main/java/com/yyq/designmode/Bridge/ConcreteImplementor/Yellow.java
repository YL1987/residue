package com.yyq.designmode.Bridge.ConcreteImplementor;

import com.yyq.designmode.Bridge.Implementor.Color;

/**
 * 作者：yangyouqiao on 2017/11/24 15:56
 * 功能：
 */

public class Yellow implements Color {
    @Override
    public String dyeing() {
        return "黄色";
    }
}
