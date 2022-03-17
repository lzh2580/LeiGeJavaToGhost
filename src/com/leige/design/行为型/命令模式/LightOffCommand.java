package com.leige.design.行为型.命令模式;

/**
 * 灭灯命令
 * 命令实现类中必须包含命令接收者
 */
public class LightOffCommand implements Command{
    private ReceiverCommand light;

    public LightOffCommand(ReceiverCommand light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
