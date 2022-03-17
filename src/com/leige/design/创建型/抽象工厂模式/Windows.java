package com.leige.design.创建型.抽象工厂模式;

/**
 * Windows
 */
public class Windows implements Computer{
    @Override
    public void printComputer() {
        System.out.println("生产windows本");
    }
}
