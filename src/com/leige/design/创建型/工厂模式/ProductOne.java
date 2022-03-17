package com.leige.design.创建型.工厂模式;

/**
 * 产品1
 */
public class ProductOne implements IProduct{
    @Override
    public void printProduct() {
        System.out.println(ProductOne.class.getName());
    }
}
