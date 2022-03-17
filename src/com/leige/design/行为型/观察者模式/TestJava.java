package com.leige.design.行为型.观察者模式;

import java.util.Observable;
import java.util.Observer;

/**
 * Java中提供了观察者模式的API，只不过主题是个类，拓展性差java.util.Observable
 * Swing，及一些常用的GUI框架都使用了观察者模式
 */
public class TestJava {
    public static void main(String[] args) {
        Observer o = new Observer() {
            @Override
            public void update(Observable o, Object arg) {

            }
        };
    }
}
