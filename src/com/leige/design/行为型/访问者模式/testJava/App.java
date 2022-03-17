package com.leige.design.行为型.访问者模式.testJava;

import java.util.Arrays;
import java.util.List;

/**
 * 针对相同的内容或信息，不同的访问者可以做不同的处理
 */
public class App {
    public static void main(String[] args) {
        List<MediaFile> mediaFiles = Arrays.asList(
                new Picture("a.jpg"),
                new Picture("b.png"),
                new Gif("c.gif")
        );
        Extractor extractor = new Extractor();
        //media是MediaFile基类的引用类型，而在Extractor中没有针对MediaFile基类的重载方法，
        // 而又由于Java是不支持双分派的，因此这里是编译不通过的。
        for (MediaFile media : mediaFiles) {
            //extractor.extract(media); // 编译不通过，在MediaFile中实现一个方法，传入Extractor参数
            media.accept(extractor);
        }
        WaterMarker watermarker = new WaterMarker();
        for (MediaFile media : mediaFiles) {
            media.accept(watermarker);
        }
    }
}
