package com.cheng.design.pattern.creational.prototype.abstractprototype;

/**
 * B 继承抽象类 A，则有A的克隆方法(常用)
 *
 * @author cheng
 *         2018/10/29 14:30
 */
public class B extends A {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        b.clone();
    }
}
