package com.leige.design.创建型.建造者模式;

/**
 * 鸡肉汉堡
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
