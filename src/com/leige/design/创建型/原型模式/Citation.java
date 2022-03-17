package com.leige.design.创建型.原型模式;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

/**
 * 原型模式是用于创建重复的对象，同时又能保证性能。
 * 实现 Cloneable - 浅拷贝：我们只拷贝对象中的基本数据类型（8种），对于数组、容器、引用对象等都不会拷贝
 * 实现 Serializable 读取二进制流 - 深拷贝：不仅能拷贝基本数据类型，还能拷贝那些数组、容器、引用对象等
 */
public class Citation implements Cloneable, Serializable {
    private String name;
    private int id;
    private String[] course;
    private Property property;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return (this.name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public void show() {
        System.out.println(name + "同学：在2022学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() {
        Citation citation = null;
        try {
            citation = (Citation) super.clone();
        } catch (CloneNotSupportedException e){
            System.out.println(e.getLocalizedMessage());
        }
        return citation;
    }
    public Citation deepClone() throws Exception {
        //将对象写入流中,
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //将对象取出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bi);
        return (Citation)ois.readObject();
    }
}
class Property{
    private Map<Integer,String> map;

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }
}