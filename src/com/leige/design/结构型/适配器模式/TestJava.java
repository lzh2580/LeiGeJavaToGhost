package com.leige.design.结构型.适配器模式;

import lombok.SneakyThrows;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * Java 中很多地方使用了适配器模式思想，
 * 比如一些类的构造方法，都是通过参数转换共用的一个this.(参数最多)
 *
 */
public class TestJava {
    @SneakyThrows
    public static void main(String[] args) throws Exception {
        OutputStreamWriter writer = new OutputStreamWriter(new ByteArrayOutputStream());
        writer.write(1);
        Arrays.asList();
    }
}
