package com.cheng.design.pattern.creational.factorymethod;

/**
 * @author cheng
 *         2018/10/25 13:12
 */
public class VueVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new VueVideo();
    }
}
