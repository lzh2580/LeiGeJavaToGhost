package com.leige.design.行为型.命令模式;

/**
 * 命令接收者 - 执行命令的对象
 */
public class ReceiverCommand {
    public void on(){
        System.out.println("灯亮了---------");
    }

    public void off(){
        System.out.println("灯灭了=========");
    }
}
