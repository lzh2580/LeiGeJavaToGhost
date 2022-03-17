package com.leige.design.行为型.访问者模式.testJava;

import com.leige.design.行为型.访问者模式.testJava.Parent;

/**
 * 子类
 */
public class Child extends Parent {
    @Override
    public void call() {
        System.out.println("I'm Child.");
    }
}
