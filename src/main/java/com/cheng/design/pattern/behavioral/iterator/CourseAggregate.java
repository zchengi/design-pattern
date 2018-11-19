package com.cheng.design.pattern.behavioral.iterator;

/**
 * @author cheng
 *         2018/11/4 15:46
 */
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
