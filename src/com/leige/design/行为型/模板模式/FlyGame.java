package com.leige.design.行为型.模板模式;

/**
 * 飞行类
 */
public class FlyGame extends Game{
    @Override
    void init() {
        System.out.println("飞行类游戏初始化");
    }

    @Override
    void start() {
        System.out.println("装备翅膀进行飞行");
    }
}
