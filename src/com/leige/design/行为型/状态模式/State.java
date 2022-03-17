package com.leige.design.行为型.状态模式;

/**
 * 状态接口，方法调用传入控制状态变量Context
 */
public interface State {
    public void doAction(Context context);
}
