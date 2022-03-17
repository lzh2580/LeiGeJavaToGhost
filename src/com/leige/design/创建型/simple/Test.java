package com.leige.design.创建型.simple;

/**
 * 简单工厂模式并不是设计模式中的一种
 */
public class Test {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Sex sex1 = factory.getSex("MAn");
        sex1.sex();
        Sex sex2 = factory.getSex("WoMan");
        sex2.sex();
    }
}
