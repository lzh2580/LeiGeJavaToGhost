package com.leige.design.行为型.中介者模式;

/**
 * 中介接口
 */
public interface Mediator {
    // 注册服务客户
    void register(Room room);
    // 通知中介者，发送消息
    void transmit(Room room);
}
