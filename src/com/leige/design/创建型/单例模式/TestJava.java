package com.leige.design.创建型.单例模式;

/**
 * jdk在单例模式的应用
 * Runtime 枚举类
 */
public class TestJava {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
    }
}