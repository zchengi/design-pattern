package com.cheng.design.pattern.creational.singleton;

/**
 * 静态内部类单例模式
 *
 * @author cheng
 *         2018/10/26 17:19
 */
public class StaticInnerClassSingle {

    private StaticInnerClassSingle() {
        if (InnerClass.staticInnerClassSingle != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static StaticInnerClassSingle getInstance() {
        return InnerClass.staticInnerClassSingle;
    }

    private static class InnerClass {
        private static StaticInnerClassSingle staticInnerClassSingle = new StaticInnerClassSingle();
    }
}
