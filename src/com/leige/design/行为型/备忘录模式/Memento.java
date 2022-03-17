package com.leige.design.行为型.备忘录模式;

/**
 * Memento 包含了要被恢复的对象的状态。pojo
 */
public class Memento {
    private int state;

    public Memento(int state){
        this.state = state;
    }

    public int getState(){
        return state;
    }
}
