package com.cheng.design.pattern.behavioral.observer;

import com.google.common.eventbus.Subscribe;

/**
 * @author cheng
 *         2018/11/14 0:12
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(String string) {

        // 业务逻辑
        System.out.println("执行 subscribe 方法，传入的参数是: " + string);
    }
}
