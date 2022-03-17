package com.leige.design.行为型.解释器模式;

import java.util.Map;

/**
 * 符号表达式 - 加减乘除
 */
public class SymbolExpression implements Expression{
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<String, Integer> map) {
        return 0;
    }
}
