package com.leige.design.创建型.抽象工厂模式;

/**
 * 工厂集合
 */
public interface Factory {
    //生产电脑产品
    public Computer createComputer();
    //生产颜色产品
    public Color coloring();
}
