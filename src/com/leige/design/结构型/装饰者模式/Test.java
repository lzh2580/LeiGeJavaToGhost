package com.leige.design.结构型.装饰者模式;

/**
 * 装饰器模式 - 动态的向一个现有的对象添加新的功能，同时又不改变其结构。拓展功能比继承更有弹性
 * 优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
 * 缺点：多层装饰比较复杂。
 * 使用场景： 1、扩展一个类的功能。 2、动态增加功能，动态撤销。
 */
public class Test {
    public static void main(String[] args) {
        Shape shape = new ShapeImp1();
        ShapeDecorator redShape1 = new RedShapeDecorator( new ShapeImp1());
        ShapeDecorator redShape2 = new RedShapeDecorator(new ShapeImp2());

        System.out.println("ShapeImp----------");
        shape.draw();

        System.out.println("\nredShape1");
        redShape1.draw();

        System.out.println("\nredShape2");
        redShape2.draw();
    }
}
