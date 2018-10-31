package com.cheng.design.pattern.structural.adapter.classadappter;

/**
 * 适配器模式
 *
 * @author cheng
 *         2018/10/31 17:35
 */
public class Test {
    public static void main(String[] args) {

        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
