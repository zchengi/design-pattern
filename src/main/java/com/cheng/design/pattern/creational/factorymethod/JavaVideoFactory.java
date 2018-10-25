package com.cheng.design.pattern.creational.factorymethod;

/**
 * @author cheng
 *         2018/10/25 13:07
 */
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
