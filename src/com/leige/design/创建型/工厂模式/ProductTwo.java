package com.leige.design.创建型.工厂模式;

/**
 * 产品2
 */
public class ProductTwo implements IProduct{
    @Override
    public void printProduct() {
        System.out.println(ProductTwo.class.getName());
    }
}
