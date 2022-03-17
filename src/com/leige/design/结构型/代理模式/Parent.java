package com.leige.design.结构型.代理模式;

import com.leige.design.结构型.装饰者模式.Child;
import com.leige.design.结构型.装饰者模式.IChild;

/**
 * 父母代理类 - 帮助孩子完成吃饭任务
 */
public class Parent implements IChild {

    private Child child;
    public Parent(Child child){
        this.child = child;
    }
    @Override
    public void eat() {
        System.out.println("吃饭前");
        child.eat();
        System.out.println("吃饭后");
    }
}
