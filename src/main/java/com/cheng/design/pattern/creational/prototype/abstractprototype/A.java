package com.cheng.design.pattern.creational.prototype.abstractprototype;

/**
 * @author cheng
 *         2018/10/29 14:30
 */
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
