package com.leige.design.行为型.模板模式;

/**
 * 模板方法设置为final
 */
public abstract class Game {
    abstract void init();
    abstract void start();
    void end(){
        System.out.println("--- Game Over !---");
    }
    public final void play(){
        init();
        start();
        end();
    }
}
