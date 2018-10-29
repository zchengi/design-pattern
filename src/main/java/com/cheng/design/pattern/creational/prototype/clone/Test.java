package com.cheng.design.pattern.creational.prototype.clone;


import java.util.Date;

/**
 * 原型模式浅克隆与深克隆
 * <p>
 * 克隆破坏单例，解决方案：
 * 1. 不实现 Cloneable 接口
 * 2. 实现 Cloneable 接口，但是直接调用 getInstance() 方法
 *
 * @author cheng
 *         2018/10/29 14:34
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig) pig1.clone();

        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(222222222222L);
        System.out.println(pig1);
        System.out.println(pig2);


        // 克隆
//        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
//        method.setAccessible(true);
//        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
//
//        System.out.println(hungrySingleton);
//        System.out.println(cloneHungrySingleton);
    }
}
