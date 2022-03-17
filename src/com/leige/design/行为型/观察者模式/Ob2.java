package com.leige.design.行为型.观察者模式;

/**
 * 观察者实现类
 * 主题实现类更改状态值，观察者实现类会得到状态值
 */
public class Ob2 extends Observer implements DisplayElement{
    public Ob2(SubjectImp subject){
        this.subject = subject;
        //添加自己到主题实现通知列表中
        subject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("页面展示O2数据=======");

    }

    @Override
    public void update(Integer state) {
        System.out.println("O2-------------"+subject.getState());
        display();
    }
}
