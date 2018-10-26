package com.cheng.design.pattern.creational.singleton;

/**
 * @author cheng
 *         2018/10/26 16:40
 */
public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton instance = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingle instance = StaticInnerClassSingle.getInstance();

//        HungrySingleton instance = HungrySingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
