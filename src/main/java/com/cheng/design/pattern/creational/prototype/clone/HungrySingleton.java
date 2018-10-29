package com.cheng.design.pattern.creational.prototype.clone;

import java.io.Serializable;

/**
 * 饿汉式单例模式
 *
 * @author cheng
 *         2018/10/26 17:28
 */
public class HungrySingleton implements Serializable, Cloneable {

    private final static HungrySingleton HUNGRY_SINGLETON /*= new HungrySingleton()*/;
    private static final long serialVersionUID = -7227991294166393671L;

    static {
        HUNGRY_SINGLETON = new HungrySingleton();
    }

    private HungrySingleton() {
        if (HUNGRY_SINGLETON != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    /**
     * ObjectInputStream 通过反射调用该方法，解决序列化产生的破坏单例模式的问题
     *
     * @return
     */
    private Object readResolve() {
        return HUNGRY_SINGLETON;
    }

    @Override
    protected Object clone() {
        return getInstance();
    }
}
