package com.leige.design.创建型.建造者模式;

/**
 * Milk
 */
public class Milk extends Drink{
    @Override
    public String name() {
        return "Milk";
    }

    @Override
    public float price() {
        return 2.0f;
    }
}
