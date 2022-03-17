package com.leige.design.行为型.解释器模式;

import java.util.Map;

/**
 * @Description:
 * @Author: lzh
 * @Date: 2022/2/24  11:35 上午
 */
public class SubExpression extends SymbolExpression{
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret(Map<String, Integer> map) {
        return left.interpret(map) - right.interpret(map);
    }
}
