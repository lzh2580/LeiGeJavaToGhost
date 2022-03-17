package com.leige.design.行为型.观察者模式;

/**
 * 又叫发布-订阅模式，定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * 两种实现方式：
 * 推：每次都会把通知以广播的方式发送给所有观察者，所有的观察者只能被动接收。（主流）
 * 拉：观察者只要知道有情况即可，至于什么时候获取内容，获取什么内容，都可以自主决定。
 * 优点： 1、观察者和被观察者是抽象耦合的。 2、建立一套触发机制。
 * 缺点： 1、如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。
 * 2、如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。
 * 3、观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。
 * 使用场景：一个对象的改变将导致其他一个或多个对象也发生改变，相互依赖改变状态有影响
 */
public class Test {
    public static void main(String[] args) {
        SubjectImp subject = new SubjectImp();
        Observer a = new Ob1(subject);
        Observer b = new Ob2(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10,false);
    }
}
