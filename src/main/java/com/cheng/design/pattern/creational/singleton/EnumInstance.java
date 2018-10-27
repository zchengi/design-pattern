package com.cheng.design.pattern.creational.singleton;

/**
 * 枚举类单例：
 * - 天然的可序列化机制能够强有力的保证不会出现多次实例化的情况，
 * - 即使在复杂的序列化情况下，或者在反射的攻击下，枚举类型的单例模式都没有问题；
 * <p>
 * 枚举类的单例实现，可能是实现单例的最佳实践
 *
 * @author cheng
 *         2018/10/27 12:06
 */
public enum EnumInstance {

    INSTANCE {
        protected void printTest() {
            System.out.println("Cheng Print Test");
        }
    };

    protected abstract void printTest();

    private Object data;

    public static EnumInstance getInstance() {
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
