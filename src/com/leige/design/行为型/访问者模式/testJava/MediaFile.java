package com.leige.design.行为型.访问者模式.testJava;

/**
 * abstract  MediaFile
 */
public abstract class MediaFile {

    protected String filePath;

    public MediaFile(String filePath) {
        this.filePath = filePath;
    }
    // 提取图像内容
    public abstract void accept(Extractor extractor);

    public abstract void accept(VisitorTest visitor);

    // 添加水印 每新增一个功能就需要修改相关的类
    public abstract void accept(WaterMarker watermarker);
}
