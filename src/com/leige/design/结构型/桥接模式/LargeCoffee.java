package com.leige.design.结构型.桥接模式;

/**
 * 大杯咖啡
 */
public class LargeCoffee extends Coffee{
    public LargeCoffee(Flavor flavor) {
        super(flavor);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯咖啡"+this.flavor.add());
    }
}
