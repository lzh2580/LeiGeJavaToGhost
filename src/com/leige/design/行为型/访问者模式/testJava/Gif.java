package com.leige.design.行为型.访问者模式.testJava;

/**
 * 此类表示动态图，如gif
 */
public class Gif extends MediaFile{
    public Gif(String filePath) {
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
