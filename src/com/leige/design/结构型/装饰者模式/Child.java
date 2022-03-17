package com.leige.design.结构型.装饰者模式;

import com.leige.design.结构型.代理模式.IStudent;

/**
 * 小学生 实现了孩子接口，学生接口
 */
public class Child implements IChild, IStudent {
    @Override
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public void study() {
        System.out.println("学习");
    }
}
