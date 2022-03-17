package com.leige.design.结构型.装饰者模式;

import com.leige.design.结构型.代理模式.IStudent;

/**
 * 小学生包装类 - 功能增强
 */
public class ChildWrapper implements IChild, IStudent {
    private Child child;
    public ChildWrapper(Child child){
        this.child = child;
    }

    @Override
    public void eat() {
        System.out.println("孩子自己会吃饭");
        child.eat();
        System.out.println("孩子完成吃饭");
    }

    @Override
    public void study() {
        System.out.println("孩子自己会学习");
        child.study();
        System.out.println("孩子完成学习");
    }
}
