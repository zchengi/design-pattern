package com.cheng.design.pattern.behavioral.command;

/**
 * @author cheng
 *         2018/11/15 14:49
 */
public class CloseCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
