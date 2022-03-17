package com.leige.design.结构型.适配器模式;

/**
 * 接口适配器模式 -- 第一步
 * - 抽象类实现接口，然后定义一个具体类实现抽象类的某一个适配器方法
 */
public abstract class DefaultAdapter implements OutputV{
    protected Output220V output220V;

    public DefaultAdapter(Output220V output220V) {
        this.output220V = output220V;
    }
    @Override
    public int output5V(){
        return output220V.output220()/44;
    }
    @Override
    public int output10V(){
        return output220V.output220()/22;
    }
    @Override
    public int output20V(){
        return output220V.output220()/11;
    }
}
