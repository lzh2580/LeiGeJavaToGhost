package com.leige.design.行为型.策略模式;

import com.leige.design.行为型.策略模式.java.Apple;

import javax.swing.event.TreeSelectionEvent;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * jdk中策略模式的使用
 * - 利用函数式接口实现策略模式
 * -
 */
public class TestJava {
    public static void main(String[] args) {
        TreeSet<Apple> set = new TreeSet<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.price >= o2.price ? 1 : 0;
            }
        });
        set.add(new Apple(1,1.0));
        set.add(new Apple(2,1.0));
        set.add(new Apple(3,4.0));
        set.stream().forEach(c -> System.out.println(c));

    }
}
