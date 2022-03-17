package com.leige.design.创建型.建造者模式;

/**
 * VegBurger
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 1.0f;
    }
}
