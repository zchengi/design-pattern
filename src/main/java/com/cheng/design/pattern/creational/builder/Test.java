package com.cheng.design.pattern.creational.builder;

/**
 * 建造者模式
 *
 * @author cheng
 *         2018/10/26 12:02
 */
public class Test {
    public static void main(String[] args) {

        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java课程",
                "Java课程PPT",
                "Java课程视频",
                "Java课程收集",
                "Java课程问答");
        System.out.println(course);
    }
}
