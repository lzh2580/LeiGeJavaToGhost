package com.leige.design.行为型.状态模式;

import java.util.Objects;

/**
 * Context 持有一个 State 的引用，负责在流程中保持并切换状态
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void doAction(){
        Objects.requireNonNull(state);
        state.doAction(this);
    }
    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
