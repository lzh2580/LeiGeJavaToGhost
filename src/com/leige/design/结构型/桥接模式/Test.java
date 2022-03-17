package com.leige.design.结构型.桥接模式;

/**
 * 桥接模式:
 * 优点： 1、抽象和实现的分离。 2、优秀的扩展能力。 3、实现细节对客户透明。
 * 缺点： 1、桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。
 *       2、桥接模式要求正确识别出系统中两个独立变化的维度，因此其使用范围具有一定的局限性。
 * 使用场景：两个独立变化的维度
 */
public class Test {
    /**
     * 1。桥接模式的分离是指将结构与实现分离或属性与基于属性的行为进行分离；而装饰者只是对基于属性的行为进行封闭成独立的类。
     * 2。桥接是横向的行为，行为彼此之间无关联；装饰者模式的行为具有可叠加性，其表现出来的结果是一个整体，各个行为组合后的一个结果。
     */
    public static void main(String[] args) {
        Flavor nullFlavor = new NullFlavor();
        Flavor sugar = new SugarFlavor();
        Coffee e = new LargeCoffee(sugar);
        e.makeCoffee();
    }
}
