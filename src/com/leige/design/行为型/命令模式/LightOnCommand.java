package com.leige.design.行为型.命令模式;

/**
 * 开灯命令
 * 命令实现类中必须包含命令接收者
 */
public class LightOnCommand implements Command{
    private ReceiverCommand light;

    public LightOnCommand(ReceiverCommand light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
