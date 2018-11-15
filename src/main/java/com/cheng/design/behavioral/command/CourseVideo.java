package com.cheng.design.behavioral.command;

/**
 * @author cheng
 *         2018/11/15 14:48
 */
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(name + "课程视频开放");
    }

    public void close() {
        System.out.println(name + "课程视频关闭");
    }
}
