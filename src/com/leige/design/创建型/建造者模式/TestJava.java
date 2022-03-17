package com.leige.design.创建型.建造者模式;

/**
 * jdk中建造者模式的使用
 * StringBuilder , StringBuffer
 * extends AbstractStringBuilder  implements Appendable
 * StringBuilder 继承了AbstractStringBuilder，AbstractStringBuilder 实现了Appendable接口的append方法
 */
public class TestJava {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();
        builder.append("qqq");
        buffer.append(1);

    }
}
