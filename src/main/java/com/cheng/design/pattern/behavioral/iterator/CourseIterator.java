package com.cheng.design.pattern.behavioral.iterator;

/**
 * @author cheng
 *         2018/11/4 15:46
 */
public interface CourseIterator {

    Course nextCourse();

    boolean isLastCourse();
}
