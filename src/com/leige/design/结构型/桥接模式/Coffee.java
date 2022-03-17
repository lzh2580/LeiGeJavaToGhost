package com.leige.design.结构型.桥接模式;

/**
 * Coffee
 */
public abstract class Coffee {
    public Flavor flavor;
    public Coffee(Flavor flavor){
        this.flavor = flavor;
    }
    public abstract void makeCoffee();
}
