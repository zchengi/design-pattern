package com.cheng.design.pattern.behavioral.mediator;

/**
 * 中介者模式
 *
 * @author cheng
 *         2018/11/15 15:30
 */
public class Test {
    public static void main(String[] args) {

        User cheng = new User("cheng");
        User tom = new User("tom");

        cheng.sendMessage("Hey! Tom!");
        tom.sendMessage("Hello! Cheng!");
    }
}
