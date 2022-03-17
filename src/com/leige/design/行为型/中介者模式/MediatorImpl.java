package com.leige.design.行为型.中介者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介实现类
 * 提供功能：客户注册 ，消息转发
 */
public class MediatorImpl implements Mediator{
    private List<Room> client = new ArrayList<>();
    @Override
    public void register(Room room) {
        if(!client.contains(room)){
            room.setMediator(this);
            client.add(room);
        }
    }

    @Override
    public void transmit(Room room) {
        client.forEach(c -> {
            // 重点在这里，通知中介列表中的其他客户，除了发消息的
            if(!c.equals(room)){
                c.receive();
            }
        });
    }
}
