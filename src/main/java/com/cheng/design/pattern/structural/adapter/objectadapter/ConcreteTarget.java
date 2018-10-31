package com.cheng.design.pattern.structural.adapter.objectadapter;

/**
 * @author cheng
 *         2018/10/31 17:32
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
