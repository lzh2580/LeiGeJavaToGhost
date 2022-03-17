package com.leige.design.结构型.适配器模式;

/**
 * 原角色 - 只能输出220V电压
 */
public class Output220V {
    public int output220(){
        System.out.println("输出电压为------220V");
        return 220;
    }
}
