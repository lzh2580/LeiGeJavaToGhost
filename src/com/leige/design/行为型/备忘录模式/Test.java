package com.leige.design.行为型.备忘录模式;

/**
 * 备忘录模式 - 在不破坏封闭的前提下捕获一个对象的内部状态，并在该对象之外保存这个状态，从而可以将对象恢复到原先保存的状态
 * 优点： 1、给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。
 *       2、实现了信息的封装，使得用户不需要关心状态的保存细节。
 * 缺点：消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。
 *
 * 使用场景： 1、需要保存/恢复数据的相关状态场景。 2、提供一个可回滚的操作。
 */
public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.play();
        originator.setState(2);
        careTaker.add(originator.saveStateToMemento());
        originator.setState(3);
        careTaker.add(originator.saveStateToMemento());
        originator.setState(4);
        System.out.println("Current State: " + originator.getState());
        originator.restore(careTaker,3);
        originator.restore(careTaker,0);
        System.out.println("Current State: " + originator.getState());
    }
}
