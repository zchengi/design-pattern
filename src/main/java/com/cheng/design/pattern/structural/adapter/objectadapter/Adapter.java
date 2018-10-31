package com.cheng.design.pattern.structural.adapter.objectadapter;

/**
 * 对象适配器模式
 *
 * @author cheng
 *         2018/10/31 17:38
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        // ...
        adaptee.adapteeRequest();
        // ...
    }
}
