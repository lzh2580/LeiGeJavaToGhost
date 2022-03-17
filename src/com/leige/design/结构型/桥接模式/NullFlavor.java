package com.leige.design.结构型.桥接模式;

/**
 * 原味
 */
public class NullFlavor implements Flavor{
    @Override
    public String add() {
        return "原味";
    }
}
