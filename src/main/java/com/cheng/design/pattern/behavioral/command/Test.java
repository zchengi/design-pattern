package com.cheng.design.pattern.behavioral.command;

/**
 * 命令模式
 *
 * @author cheng
 *         2018/11/15 15:18
 */
public class Test {
    public static void main(String[] args) {

        CourseVideo courseVideo = new CourseVideo("Java设计模式");
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);

        staff.executeCommands();
    }
}
