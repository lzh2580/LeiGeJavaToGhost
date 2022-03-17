package com.leige.design.创建型.工厂模式;

/**
 * 工厂模式 - 定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 * 优点： 1、一个调用者想创建一个对象，只要知道其名称就可以。
 *       2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
 *       3、屏蔽产品的具体实现，调用者只关心产品的接口。
 *
 * 缺点：每增加一个产品都需要增加一个具体类和对象实现工厂，
 * 使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖
 */
public class Test {
    /**
     * 工厂模式 - 生产一类产品
     */
    public static void main(String[] args) {
        ProductFactory factory = new FactoryOne();
        factory.create().printProduct();
        ProductFactory factory1 = new FactoryTwo();
        factory1.create().printProduct();
    }
}
