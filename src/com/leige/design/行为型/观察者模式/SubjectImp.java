package com.leige.design.行为型.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题实现类
 * 包含状态值，观察者list，通知方法
 */
public class SubjectImp implements Subject{
    // 观察者list
    private List<Observer> observers;

    private Integer state;
    public SubjectImp(){
        observers = new ArrayList<Observer>(5);
    }

    public int getState() {
        return state;
    }

    /**
     * 状态值改变，通知所有观察者
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    /**
     * flag为true只通知第一个观察者
     * flag为false只通知最后一个观察者
     */
    public void setState(int state,boolean flag) {
        this.state = state;
        if(flag){
            notifyObserver(observers.get(0));
        }else{
            if(observers.size() > 0){
                notifyObserver(observers.get(observers.size()-1));
            }else{
                System.out.println("通知异常");
            }
        }
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        for(Observer o : observers){
            o.update(state);
        }
    }

    @Override
    public void notifyObserver(Observer observer) {
        observer.update(state);
    }
}
