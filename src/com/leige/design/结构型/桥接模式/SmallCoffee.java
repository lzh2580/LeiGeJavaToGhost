package com.leige.design.结构型.桥接模式;

/**
 * 小杯咖啡
 */
public class SmallCoffee extends Coffee{
    public SmallCoffee(Flavor flavor) {
        super(flavor);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯咖啡"+this.flavor.add());
    }
}
