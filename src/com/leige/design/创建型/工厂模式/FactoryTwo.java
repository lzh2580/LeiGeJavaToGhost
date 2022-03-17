package com.leige.design.创建型.工厂模式;

/**
 * 制造产品2的工厂2
 */
public class FactoryTwo implements ProductFactory{
    @Override
    public IProduct create() {
        return new ProductTwo();
    }
}
