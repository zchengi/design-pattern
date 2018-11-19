package com.cheng.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * @author cheng
 *         2018/11/4 15:48
 */
public class CourseIteratorImpl implements CourseIterator {

    private List courseList;

    private int position;

    private Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {

        System.out.println("返回课程，位置是：" + position);
        course = (Course) courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        return position >= courseList.size();
    }
}
