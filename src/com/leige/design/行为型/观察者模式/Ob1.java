package com.leige.design.行为型.观察者模式;

/**
 * 观察者实现类
 * 主题实现类更改状态值，观察者实现类会得到状态值
 */
public class Ob1 extends Observer implements DisplayElement{
    public Ob1(SubjectImp subject){
        this.subject = subject;
        // 主题订阅
        subject.registerObserver(this);
    }
    @Override
    public void display() {
         System.out.println("页面展示O1数据=======");
    }

    @Override
    public void update(Integer state) {
        System.out.println("O1-------------"+subject.getState());
        display();
    }
}
