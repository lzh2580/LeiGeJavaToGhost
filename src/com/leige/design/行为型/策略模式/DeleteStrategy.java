package com.leige.design.行为型.策略模式;

/**
 * DeleteStrategy
 */
public class DeleteStrategy implements Strategy{
    @Override
    public int operation(int a, int b) {
        return a-b;
    }
}
