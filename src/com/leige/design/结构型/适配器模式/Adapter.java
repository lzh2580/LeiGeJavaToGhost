package com.leige.design.结构型.适配器模式;

import java.io.OutputStreamWriter;

/**
 * 类适配器模式 - 继承源类，实现目标接口的方式实现适配的。
 * 由于Java单继承的机制，这就要求目标必须是接口，有一定的局限性。
 */
public class Adapter extends Output220V implements Output5V{
    @Override
    public int output5V() {
        int i = output220();
        int convert = i/44;
        System.out.println("类适配器转换电压，转换前为"+i+"V,转换后为"+convert+"V");
        return convert;
    }
}
