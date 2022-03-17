package com.leige.design.创建型.建造者模式;

/**
 * 饮品
 */
public abstract class Drink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
