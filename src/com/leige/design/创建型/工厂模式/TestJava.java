package com.leige.design.创建型.工厂模式;
import lombok.SneakyThrows;

import java.lang.reflect.Array;
import java.lang.reflect.Proxy;

/**
 * newInstance() 方法一般都是运用工厂模式
 * Proxy x = Proxy.newProxyInstance(x,x,x);
 */
public class TestJava {
    @SneakyThrows
    public static void main(String[] args) throws Exception {

        Object a = Class.forName("java.lang.String").newInstance();
        //Array.newInstance(x,y)创建一个指定类型为x，长度为y的数组
        String[] b = (String[])Array.newInstance(String.class,10);
        Array.set(b,0,"甲乙丙丁");
        System.out.println(b[0]);
    }
}
