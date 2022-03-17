package com.leige.design.创建型.建造者模式;

/**
 * 汉堡
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
