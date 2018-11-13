package com.cheng.design.behavioral.interpreter;

/**
 * @author cheng
 *         2018/11/13 11:10
 */
public class OperatorUtil {

    public static boolean isOperator(String symbol) {
        return symbol.equals("+") || symbol.equals("*");
    }

    public static Interpreter getExpressionObject(Interpreter firstExpression,
                                                  Interpreter secondExpression,
                                                  String symbol) {
        if (symbol.equals("+")) {
            return new AddInterpreter(firstExpression, secondExpression);
        } else if (symbol.equals("*")) {
            return new MultiInterpreter(firstExpression, secondExpression);
        }

        return null;
    }
}
