package com.leige.design.行为型.访问者模式.testJava;

/**
 * WaterMarker
 */
public class WaterMarker implements VisitorTest{
    @Override
    public void visit(Picture picture) {
        System.out.println("给静态图片[" + picture.filePath + "]添加水印");
    }

    @Override
    public void visit(Gif gif) {
        System.out.println("给动态图片[" + gif.filePath + "]添加水印");
    }
}
