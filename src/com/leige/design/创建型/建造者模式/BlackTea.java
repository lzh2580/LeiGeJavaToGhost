package com.leige.design.创建型.建造者模式;

/**
 * 红茶
 */
public class BlackTea extends Drink{
    @Override
    public String name() {
        return "BlackTea";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
