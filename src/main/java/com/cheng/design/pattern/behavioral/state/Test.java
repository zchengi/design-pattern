package com.cheng.design.pattern.behavioral.state;

/**
 * 状态模式
 *
 * @author cheng
 *         2018/11/19 11:36
 */
public class Test {
    public static void main(String[] args) {

        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);

        System.out.println("当前状态: " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.pause();
        System.out.println("当前状态: " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.speed();
        System.out.println("当前状态: " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.stop();
        System.out.println("当前状态: " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.speed();
    }
}
