package com.leige.design.行为型.命令模式;

/**
 * 简单命令调用类 - 单命令调用
 */
public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
