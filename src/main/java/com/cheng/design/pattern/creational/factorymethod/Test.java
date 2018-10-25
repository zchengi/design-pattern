package com.cheng.design.pattern.creational.factorymethod;

/**
 * @author cheng
 *         2018/10/25 12:25
 */
public class Test {
    public static void main(String[] args) {

        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory2 = new PythonVideoFactory();
        VideoFactory videoFactory3 = new VueVideoFactory();
        videoFactory.getVideo().produce();
        videoFactory2.getVideo().produce();
        videoFactory3.getVideo().produce();
    }
}
