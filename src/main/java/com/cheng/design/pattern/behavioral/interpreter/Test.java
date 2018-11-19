package com.cheng.design.pattern.behavioral.interpreter;

/**
 * 解释器模式
 *
 * @author cheng
 *         2018/11/13 10:59
 */
public class Test {
    public static void main(String[] args) {

        String chengInputStr = "6 100 11 + * ";
        ChengExpressionParser expressionParser = new ChengExpressionParser();
        int result = expressionParser.parse(chengInputStr);
        System.out.println("解释器计算结果：" + result);
    }
}
