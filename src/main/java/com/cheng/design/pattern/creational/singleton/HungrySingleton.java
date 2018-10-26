package com.cheng.design.pattern.creational.singleton;

/**
 * 饿汉式单例模式
 *
 * @author cheng
 *         2018/10/26 17:28
 */
public class HungrySingleton {

    private final static HungrySingleton HUNGRY_SINGLETON /*= new HungrySingleton()*/;

    static {
        HUNGRY_SINGLETON = new HungrySingleton();
    }

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}
