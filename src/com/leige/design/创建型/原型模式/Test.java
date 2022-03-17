package com.leige.design.创建型.原型模式;

import java.util.HashMap;

/**
 * 原型模式是用于创建重复的对象，同时又能保证性能。
 * 实现 Cloneable - 浅拷贝：我们只拷贝对象中的基本数据类型（8种），对于数组、容器、引用对象等都不会拷贝
 * 实现 Serializable 读取二进制流 - 深拷贝：不仅能拷贝基本数据类型，还能拷贝那些数组、容器、引用对象等
 *
 * 优点： 1、性能提高。 2、逃避构造函数的约束。
 * 缺点： 1、当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候，很难对类的功能进行通盘考虑
 *       2、必须实现 Cloneable 接口。
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Citation citation = new Citation();
        String[] course = {"语文","数学","英语"};
        Property p = new Property();
        HashMap<Integer,String> map = new HashMap<>(3);
        map.put(1,course[0]);
        map.put(2,course[1]);
        map.put(3,course[2]);
        citation.setName("王宝强");
        citation.setId(2);
        citation.setCourse(course);
        citation.setProperty(p);
        Citation c = citation.clone();
        citation.show();
        c.show();
        System.out.println(citation == c);
        System.out.println(citation.getProperty() == c.getProperty());
        System.out.println(citation.getId() == c.getId());
        System.out.println(citation.getCourse() == c.getCourse());
    }
}
