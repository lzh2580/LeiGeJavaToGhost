package com.leige.design.行为型.访问者模式.testJava;

/**
 * 该类代表静态图片，如jpg、png
 */
public class Picture extends MediaFile{
    public Picture(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Extractor extractor) {
        extractor.extract(this);
    }

    @Override
    public void accept(VisitorTest visitor) {
        visitor.visit(this);
    }

    @Override
    public void accept(WaterMarker watermarker) {
        watermarker.visit(this);
    }
}
