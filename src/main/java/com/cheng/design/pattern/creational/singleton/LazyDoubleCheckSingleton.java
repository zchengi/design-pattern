package com.cheng.design.pattern.creational.singleton;

/**
 * DoubleCheck 双重检查单例模式
 *
 * @author cheng
 *         2018/10/26 16:55
 */
public class LazyDoubleCheckSingleton {

    /**
     * volatile ：
     * -        将当前处理器缓存行的数据写回到系统内存，这个操作会使在其他CPU里缓存了该内存地址的数据无效，
     * -        所以又从共享内存同步数据，这样就保证了内存的可见性（主要使用了缓存一致性协议）
     */
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {

        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    // intra-thread semantics java语言允许单线程内不会改变语句执行结果的指令可以重排序

                    // 1. 分配内存给这个对象
                    // 3. 设置 lazyDoubleCheckSingleton 指向刚分配的内存地址
                    // 2. 初始化对象
                    // --------  3. 设置 lazyDoubleCheckSingleton 指向刚分配的内存地址
                }
            }
        }

        return lazyDoubleCheckSingleton;
    }
}
