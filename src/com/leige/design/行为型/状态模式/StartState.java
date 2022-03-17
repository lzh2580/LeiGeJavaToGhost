package com.leige.design.行为型.状态模式;

/**
 * start状态类，实现 State接口
 */
public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
    @Override
    public String toString(){
        return "Start State";
    }
}
