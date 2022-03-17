package com.leige.design.行为型.模板模式;
import java.util.ArrayList;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * jdk中模板模式的使用
 * ArrayList extends AbstractList<E>
 * 很多参数校验  都抽象到抽象类中  作为模板方法，然后其他方法由实现类实现
 * AQS中的一些实现
 */
public class TestJava {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<Integer> list1 = new ArrayList();
        list1.addAll(list);
    }
}
