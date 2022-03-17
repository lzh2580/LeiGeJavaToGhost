package com.leige.design.结构型.外观模式;

/**
 * 阿里短信消息
 */
public class AliSmsServiceImpl implements AliSmsService{
    @Override
    public void sendSms() {
        System.out.println("阿里短信消息");
    }
}
