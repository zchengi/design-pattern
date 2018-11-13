package com.cheng.design.behavioral.interpreter;

import java.util.Stack;

/**
 * @author cheng
 *         2018/11/13 11:02
 */
public class ChengExpressionParser {

    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str) {
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray) {
            if (!OperatorUtil.isOperator(symbol)) {
                Interpreter numberExpression = new NumberInterpreter(symbol);
                stack.push(numberExpression);
                System.out.format("入栈: %d \n", numberExpression.interpret());
            } else {
                // 是运算符号，可以计算
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.format("出栈: %d 和 %d \n", firstExpression.interpret(), secondExpression.interpret());

                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.format("应用运算符: %s \n", operator);
                int result = operator.interpret();
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.format("阶段结果入栈: %d \n", resultExpression.interpret());
            }
        }

        return stack.pop().interpret();
    }
}
