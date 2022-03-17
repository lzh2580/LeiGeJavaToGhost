package com.leige.design.创建型.抽象工厂模式;

/**
 * WindowsFactory
 */
public class WindowsFactory implements Factory{
    @Override
    public Computer createComputer() {
        return new Windows();
    }

    @Override
    public Color coloring() {
        return new BuleColor();
    }
}
