package com.leige.design.创建型.工厂模式;

/**
 * 制造产品1的工厂1
 */
public class FactoryOne implements ProductFactory{
    @Override
    public IProduct create() {
        return new ProductOne();
    }
}
