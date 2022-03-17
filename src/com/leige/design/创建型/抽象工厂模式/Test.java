package com.leige.design.创建型.抽象工厂模式;

/**
 * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。
 * 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
 * 优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 * 缺点：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
 */
public class Test {
    /**
     * 抽象工厂模式 - 生产多类产品
     */
    public static void main(String[] args) {
        Factory factory = new MacFactory();
        factory.createComputer().printComputer();
        factory.coloring().color();
        Factory factory1 = new WindowsFactory();
        factory1.createComputer().printComputer();
        factory1.coloring().color();
    }
}
