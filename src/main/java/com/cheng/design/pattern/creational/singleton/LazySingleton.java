package com.cheng.design.pattern.creational.singleton;

/**
 * 单例模式
 *
 * @author cheng
 *         2018/10/26 16:36
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

//    private static boolean flag = true;

    private LazySingleton() {
        /*if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("单例构造器禁止反射调用");
        }*/
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

/*    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        // 测试反射攻击
        Class objectClass = LazySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        LazySingleton o1 = LazySingleton.getInstance();

        Field flag = o1.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(o1, true);

        LazySingleton o2 = (LazySingleton) constructor.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);
    }*/

    /*public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }*/

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }

    /*public static LazySingleton getInstance() {
        synchronized (LazySingleton.class) {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
            return lazySingleton;
        }
    }*/
}
