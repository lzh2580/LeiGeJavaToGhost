package com.leige.design.结构型.组合模式;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * jdk中组合模式的使用
 * HashMap
 */
public class TestJava {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Hashtable<String, String> table = new Hashtable<>();
        map.put("1","1");
        map.put("2","2");
        // HashMap允许kv为null，Hashtable不允许kv为null
        map.put(null,"1");
        map.put("4",null);
        map.put(null,null);
        System.out.println(map);
        //table.putAll(map);    // Hashtable报错
        System.out.println(table);

    }
}
