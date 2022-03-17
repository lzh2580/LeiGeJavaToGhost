package com.leige.design.结构型.享元模式;

/**
 * jdk中享元模式的使用
 *   Integer.valueOf(9);   使用缓存IntegerCache
 *   连接池，线程池，资源可以复用的，都可以当作享元模式的实现
 */
public class TestJava {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(9);
        Integer b = 9;
        Integer c = 9;
        System.out.println(a == b && b == c);

    }
}
