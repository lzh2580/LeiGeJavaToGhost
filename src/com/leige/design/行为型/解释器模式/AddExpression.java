package com.leige.design.行为型.解释器模式;

import java.util.Map;

/**
 * 相加表达式
 */
public class AddExpression extends SymbolExpression{
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret(Map<String, Integer> map) {
        return left.interpret(map) + right.interpret(map);
    }
}
