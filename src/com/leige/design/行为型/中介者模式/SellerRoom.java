package com.leige.design.行为型.中介者模式;

/**
 * 卖房者
 */
public class SellerRoom extends Room{
    @Override
    public void receive() {
        System.out.println("有人要买房了");
    }

    @Override
    public void send() {
        System.out.println("卖家发出消息  --  急售");
        this.mediator.transmit(this);
    }
}
