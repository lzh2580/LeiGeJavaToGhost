package com.leige.design.行为型.访问者模式.testJava;

/**
 * Extractor
 */
public class Extractor implements VisitorTest{
    //静态编译不通过，找不到传参数为 MediaFile 的方法
//    public void extract(MediaFile l) {
//        System.out.println("提取动态图片[" + l.filePath + "]中的图像信息");
//        // 省略:image对象数据填充操作，图像鉴别操作
//    }
    public void extract(Picture picture) {
        System.out.println("提取静态图片[" + picture.filePath + "]中的图像信息");
        // 省略:image对象数据填充操作，图像鉴别操作
    }

    public void extract(Gif gif) {
        System.out.println("提取动态图片[" + gif.filePath + "]中的图像信息");
        // 省略:image对象数据填充操作，图像鉴别操作
    }

    @Override
    public void visit(Picture picture) {
        System.out.println("提取静态图片[" + picture.filePath + "]中的图像信息");
    }

    @Override
    public void visit(Gif gif) {
        System.out.println("提取动态图片[" + gif.filePath + "]中的图像信息");

    }

}
