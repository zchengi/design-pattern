package com.cheng.design.pattern.creational.simplefactory;

/**
 * @author cheng
 *         2018/10/25 12:25
 */
public class JavaVideo extends AbstractVideo {
    @Override
    public void produce() {
        System.out.println("Java课程视频");
    }
}
