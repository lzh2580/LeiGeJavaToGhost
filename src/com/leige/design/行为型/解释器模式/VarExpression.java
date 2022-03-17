package com.leige.design.行为型.解释器模式;

import java.util.Map;

/**
 * 终结符类 - 变量表达式
 */
public class VarExpression implements Expression{
    String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpret(Map<String, Integer> map) {
        return map.get(key);
    }
}
