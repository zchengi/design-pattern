package com.cheng.design.pattern.creational.singleton;

/**
 * 单例模式：懒汉式
 * 演进版本：synchronized 线程同步 懒汉式
 * 演进版本：DoubleCheck 双重检查 懒汉式
 * 演进版本：静态内部类 懒汉式
 * <p>
 * 单例模式：饿汉式
 * <p>
 * 单例模式：枚举单例
 * <p>
 * 单例模式：容器单例
 * <p>
 * 单例模式：ThreadLocal 线程单例
 *
 * @author cheng
 *         2018/10/26 16:39
 */
public class Test {
    public static void main(String[] args) {

//        LazySingleton lazySingleton = LazySingleton.getInstance();

        // ThreadLocal 线程单例 只能实现在一个线程中是单例的
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();

        System.out.println("program end.");


        // 序列化破坏单例模式
//        HungrySingleton instance = HungrySingleton.getInstance();
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
////        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(instance.getData() == newInstance.getData());


        // 反射攻击解决方案
//        Class objectClass = HungrySingleton.class;
//        Class objectClass = StaticInnerClassSingle.class;
//        Class objectClass = LazySingleton.class;
//        Class objectClass = EnumInstance.class;

//        Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);

//        constructor.setAccessible(true);
//        EnumInstance instance = (EnumInstance) constructor.newInstance("cheng", 123);

//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

//        StaticInnerClassSingle instance = StaticInnerClassSingle.getInstance();
//        StaticInnerClassSingle newInstance = (StaticInnerClassSingle) constructor.newInstance();

//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();

//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);


//        EnumInstance enumInstance = EnumInstance.getInstance();
//        enumInstance.printTest();
    }
}
