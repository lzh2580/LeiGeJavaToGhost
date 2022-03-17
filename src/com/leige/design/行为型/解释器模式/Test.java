package com.leige.design.行为型.解释器模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 解释器模式 - 给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。
 * 优点： 1、可扩展性比较好，灵活。 2、增加了新的解释表达式的方式。 3、易于实现简单文法。
 * 缺点： 1、可利用场景比较少。 2、对于复杂的文法比较难维护。 3、解释器模式会引起类膨胀。 4、解释器模式采用递归调用方法。
 * 应用：用在 SQL 解析、符号处理引擎等。
 */
public class Test {
    public static void main(String[] args) {
        String quest = "a+b-c+d";
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        Calculator calculator = new Calculator(quest);
        int i = calculator.calculate(map);
        System.out.println(i);

    }
}
