package com.leige.design.结构型.外观模式;

/**
 * 用户注册完之后，需要调用阿里短信接口、邮件接口、微信推送接口。
 */
public class PlatForm {
    AliSmsService aliSmsService;
    EmailSmsService emailSmsService;

    public PlatForm() {
        this.aliSmsService = new AliSmsServiceImpl();
        this.emailSmsService = new EamilSmsServiceImpl();
    }
    public void sendMsg(){
        aliSmsService.sendSms();
        emailSmsService.sendSms();
    }
    public void sendAliMsg(){
        aliSmsService.sendSms();
    }
    public void sendEmaiMsg(){
        emailSmsService.sendSms();

    }
}
