package com.leige.design.行为型.中介者模式;

/**
 * 买房者
 */
public class BuyerRoom extends Room{
    @Override
    public void receive() {
        System.out.println("有人要卖房了");
    }

    @Override
    public void send() {
        System.out.println("买家发出消息  --  急求房源");
        this.mediator.transmit(this);
    }
}
