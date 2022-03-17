package com.leige.design.结构型.外观模式;

/**
 * 发送邮件消息
 */
public class EamilSmsServiceImpl implements EmailSmsService{
    @Override
    public void sendSms() {
        System.out.println("发送邮件消息");
    }
}
