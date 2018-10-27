package com.cheng.design.pattern.creational.singleton;

/**
 * ThreadLocal 线程单例
 *
 * @author cheng
 *         2018/10/27 12:42
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> THREAD_LOCAL_INSTANCE_THREAD_LOCAL = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance() {
        return THREAD_LOCAL_INSTANCE_THREAD_LOCAL.get();
    }
}
