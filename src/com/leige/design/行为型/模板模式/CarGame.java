package com.leige.design.行为型.模板模式;

/**
 * 子类具体实现某些特定步骤
 */
public class CarGame extends Game{
    @Override
    void init() {
        System.out.println("开车类游戏初始化");
    }

    @Override
    void start() {
        System.out.println("开着五菱宏光游览");
    }
}
