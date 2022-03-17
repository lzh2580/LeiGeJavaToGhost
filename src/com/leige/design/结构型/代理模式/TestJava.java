package com.leige.design.结构型.代理模式;

import java.lang.reflect.Constructor;
import java.lang.reflect.Proxy;

/**
 * jdk中代理模式的使用
 * jdk动态代理必须实现接口 InvocationHandler
 */
public class TestJava {
    public static void main(String[] args) throws Exception{
        Constructor x = Class.forName("java.lang.reflect.Proxy").getDeclaredConstructor();
        x.setAccessible(true);
        Proxy proxy = (Proxy) x.newInstance();
        System.out.println(proxy.getClass().getName());
    }
}
