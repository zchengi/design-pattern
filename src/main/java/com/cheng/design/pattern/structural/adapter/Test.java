package com.cheng.design.pattern.structural.adapter;

/**
 * @author cheng
 *         2018/10/31 17:45
 */
public class Test {
    public static void main(String[] args) {

        DC5 dc5 = new PowerAdapter();
        dc5.outputDCV();
    }
}
