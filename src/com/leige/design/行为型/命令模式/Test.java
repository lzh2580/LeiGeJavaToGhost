package com.leige.design.行为型.命令模式;

/**
 * 命令模式：将“请求”封装成对象，以便使用不同的请求、日志、队列等来参数化其他对象。命令模式也支持撤销操作。
 * 优点：1、降低了系统耦合度。请求发送者和接受者进行解耦
 *      2、新的命令可以很容易添加到系统中去。
 * 缺点：使用命令模式可能会导致某些系统有过多的具体命令类。
 * 使用场景：认为是命令的地方都可以使用命令模式，比如： 1、GUI 中每一个按钮都是一条命令。 2、模拟 CMD。
 */
public class Test {
    /**
     * 一个命令实现类中包含命令执行者，调用命令执行者自带的一些行为
     */
    public static void main(String[] args) {
        //simple();
        complex();
    }
    public static void simple(){
        SimpleRemoteControl controller = new SimpleRemoteControl();
        ReceiverCommand receiver = new ReceiverCommand();
        LightOnCommand lightOnCommand = new LightOnCommand(receiver);
        controller.setCommand(lightOnCommand);
        controller.buttonWasPressed();
    }
    public static void complex(){
        RemoteControl control = new RemoteControl();
        ReceiverCommand receiver = new ReceiverCommand();
        LightOnCommand lightOnCommand = new LightOnCommand(receiver);
        LightOffCommand lightOffCommand = new LightOffCommand(receiver);
        control.writeCommand(lightOnCommand);
        control.writeCommand(lightOffCommand);
        control.writeCommand(lightOffCommand);
        control.executeCommand();
    }

}
