package com.leige.design.创建型.simple;

/**
 * 定义一个简单工厂类，根据传参进行创建对应的的实例
 */
public class SimpleFactory {
    public Sex getSex(String sex){
        if("Man".equalsIgnoreCase(sex)){
            return new Man();
        }else if("Woman".equalsIgnoreCase(sex)){
            return new Woman();
        }else{
            return null;
        }
    }
}
