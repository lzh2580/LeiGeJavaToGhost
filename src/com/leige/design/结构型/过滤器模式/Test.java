package com.leige.design.结构型.过滤器模式;

import java.util.LinkedList;
import java.util.List;

/**
 * 过滤器模式 或标准模式 - 允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。
 */
public class Test {
    public static void main(String[] args) {
        List<Person> persons = new LinkedList<Person>();
        for (int i = 0; i < 10 ; i++) {
            if (i<5) {
                persons.add(new Person(String.valueOf(i), "男"));
            }else {
                persons.add(new Person(String.valueOf(i), "女"));
            }
        }
        IFilter boyFilter = new BoyFilter();
        persons = boyFilter.filter(persons);
        persons.forEach(person -> System.out.println(person.toString()));
    }
}
