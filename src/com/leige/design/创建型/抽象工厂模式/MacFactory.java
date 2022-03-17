package com.leige.design.创建型.抽象工厂模式;

/**
 * MacFactory
 */
public class MacFactory implements Factory{
    @Override
    public Computer createComputer() {
        return new Mac();
    }

    @Override
    public Color coloring() {
        return new BuleColor();
    }
}
