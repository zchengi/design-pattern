package com.cheng.design.pattern.behavioral.observer;

import com.google.common.eventbus.EventBus;

/**
 * Guava 观察者模式测试
 *
 * @author cheng
 *         2018/11/14 0:12
 */
public class GuavaEventTest {

    public static void main(String[] args) {

        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("这是内容");
    }
}
