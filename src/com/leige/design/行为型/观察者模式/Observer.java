package com.leige.design.行为型.观察者模式;

/**
 * 观察者接口-消费方
 * 包含主题实现类 及 获取主题类状态值
 */
public abstract class Observer {
    public SubjectImp subject;
    public abstract void update(Integer state);
}
