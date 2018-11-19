package com.cheng.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式
 *
 * @author cheng
 *         2018/11/18 18:33
 */
public class Test {
    public static void main(String[] args) {

        List<Course> courseList = new ArrayList<>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("Vue Course");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java Course");
        codingCourse.setPrice(199);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {
            course.accept(new Visitor());
        }
    }
}
