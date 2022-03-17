package com.leige.design.行为型.访问者模式.testJava;

/**
 * 访问者接口，具体如何访问，由其实现类定义
 */
public interface VisitorTest {
    void visit(Picture picture);
    void visit(Gif gif);
}
