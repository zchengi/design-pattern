package com.cheng.design.pattern.creational.singleton;

/**
 * 单例模式：懒汉式
 * 演进版本：synchronized 线程同步 懒汉式
 * 演进版本：DoubleCheck 双重检查 懒汉式
 * 演进版本：静态内部类 懒汉式
 * <p>
 * 单例模式：饿汉式
 *
 * @author cheng
 *         2018/10/26 16:39
 */
public class Test {
    public static void main(String[] args) {

//        LazySingleton lazySingleton = LazySingleton.getInstance();

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();

        System.out.println("program end.");
    }
}
