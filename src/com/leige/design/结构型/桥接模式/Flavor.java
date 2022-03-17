package com.leige.design.结构型.桥接模式;

/**
 * 独立维度：大小杯，有无糖
 * 大小杯作为咖啡属性，有无糖作为接口
 */
public interface Flavor {
    String add();
}
