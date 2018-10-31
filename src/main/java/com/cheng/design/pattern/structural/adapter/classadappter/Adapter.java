package com.cheng.design.pattern.structural.adapter.classadappter;

/**
 * 类适配器模式
 *
 * @author cheng
 *         2018/10/31 17:33
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        // ...
        super.adapteeRequest();
        // ...
    }
}
