package com.leige.design.行为型.解释器模式;

import java.util.Map;

/**
 * 表达式解析接口
 */
public interface Expression {
    int interpret(Map<String, Integer> map);
}
