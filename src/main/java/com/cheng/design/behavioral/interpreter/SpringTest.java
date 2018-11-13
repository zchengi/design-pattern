package com.cheng.design.behavioral.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Spring 实现的解释器实例
 *
 * @author cheng
 *         2018/11/13 11:25
 */
public class SpringTest {
    public static void main(String[] args) {

        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("100 * 2 + 400 * 1 + 66");
        int result = (int) expression.getValue();
        System.out.println(result);
    }
}
