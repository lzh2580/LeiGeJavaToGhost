package com.leige.design.行为型.命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类/请求者 - 多命令组合调用
 * 包含一组待执行命令
 */
public class RemoteControl {
    private List<Command> list = new ArrayList<>();
    public void writeCommand(Command command){
        list.add(command);
    }
    public void executeCommand(){
        for(Command c : list){
            c.execute();
        }
        list.clear();
    }
}
