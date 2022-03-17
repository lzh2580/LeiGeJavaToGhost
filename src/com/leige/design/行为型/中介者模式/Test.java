package com.leige.design.行为型.中介者模式;

/**
 * 中介者模式 - 定义一个中介对象来封装一系列对象之间的交互，使原有对象之间的耦合松散，且可以独立地改变它们之间的交互。
 *             中介者模式又叫调停模式，它是迪米特法则的典型应用。
 *
 * 优点： 1、降低了类的复杂度，将一对多转化成了一对一。 2、各个类之间的解耦。 3、符合迪米特原则。
 * 缺点： 中介者会庞大，变得复杂难以维护。
 */
public class Test {
    /**
     * 中介者模式与观察者模式区别：
     * - 观察者模式是一主题多订阅，而中介者模式是一中介对多客户的交互
     * - 观察者模式只能单向通知，只能从主题更新以后通知订阅者，而中介者模式随便哪个客户发生变化都可以通知
     */
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        Room buy = new BuyerRoom();
        Room sell = new SellerRoom();
        mediator.register(buy);
        mediator.register(sell);
        buy.send();
        sell.send();
    }
}
