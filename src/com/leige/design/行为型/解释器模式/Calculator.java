package com.leige.design.行为型.解释器模式;

import java.util.Map;
import java.util.Stack;

/**
 * 计算机类 - 负责计算解析
 */
public class Calculator {
    private Expression expression;
    public Calculator(String strExpression) {
        Expression left;
        Expression right;
        char[] array = strExpression.toCharArray();
        //解释器模式一般要用栈存储对应的单元表达式
        Stack<Expression> stack = new Stack<>();
        //解析表达式
        for (int i = 0; i < array.length; i++) {
            switch (array[i]){
                case '+':
                    //加符号构建相加表达式
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(array[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(array[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    //变量直接入栈
                    stack.push(new VarExpression(String.valueOf(array[i])));
            }
        }
        this.expression = stack.pop();
    }

    public int calculate(Map<String, Integer> map){
        return this.expression.interpret(map);
    }
}
