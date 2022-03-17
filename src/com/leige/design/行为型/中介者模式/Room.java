package com.leige.design.行为型.中介者模式;

/**
 * 中介服务 - 客户抽象类 资源
 */
public abstract class Room {
    // 中介者抽象类 - 一个客户对应的一个中介
    protected Mediator mediator;
    // 接受消息
    public abstract void receive();
    // 发送消息
    public abstract void send();
    // 中介那边注册客户信息以后，客户这边也要注册中介
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
