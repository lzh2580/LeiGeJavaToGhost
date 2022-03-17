package com.leige.design.行为型.观察者模式;

/**
 * 主题接口-服务端
 */
public interface Subject {
    // 向主题端注册
    public void registerObserver(Observer observer);
    // 移除观察者
    public void removeObserver(Observer observer);
    // 全部通知
    public void notifyAllObserver();
    // 定点通知
    public void notifyObserver(Observer observer);
}
