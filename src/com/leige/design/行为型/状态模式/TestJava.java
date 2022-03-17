package com.leige.design.行为型.状态模式;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * jdk中状态模式的使用 允许在运行时根据内部状态轻松更改对象的行为。
 * java.util.Iterator
 * javax.faces.lifecycle.LifeCycle#execute()
 */
public class TestJava {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(22);
        list.add(333);
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            iterator.next();
        }
        ReentrantReadWriteLock o = new ReentrantReadWriteLock();

    }
}
