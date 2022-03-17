package com.leige.design.结构型.适配器模式;

/**
 * 适配器模式 - 将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本接口不兼容的类可以合作无间
 *
 * 优点： 1、可以让任何两个没有关联的类一起运行。 2、提高了类的复用。 3、增加了类的透明度。 4、灵活性好。
 * 缺点： 1、过多地使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是A接口，内部被适配成了B直接对系统进行重构。
 * 2.由于 JAVA 至多继承一个类，所以至多只能适配一个适配者类，而且目标类必须是抽象类。
 */
public class Test {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.output5V();
        ObjectAdapter objectAdapter = new ObjectAdapter(new Output220V());
        objectAdapter.output5V();
        ChinaAdapter chinaAdapter = new ChinaAdapter(new Output220V());
        chinaAdapter.output5V();
    }
}
