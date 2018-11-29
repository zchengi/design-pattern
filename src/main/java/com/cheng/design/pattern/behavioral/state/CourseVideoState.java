package com.cheng.design.pattern.behavioral.state;

/**
 * @author cheng
 *         2018/11/19 11:23
 */
public abstract class CourseVideoState {

    protected CourseVideoContext courseVideoContext;

    public abstract void play();

    public abstract void speed();

    public abstract void pause();

    public abstract void stop();

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }
}
