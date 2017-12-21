package com.yyq.designmode.Bridge.Abstraction;

import com.yyq.designmode.Bridge.Implementor.Color;

/**
 * 作者：yangyouqiao on 2017/11/24 15:57
 * 功能：
 */

public abstract class Clothes {
    public Color color;

    public abstract void getColor();

    public void setColor(Color color) {
        this.color = color;
    }
}
