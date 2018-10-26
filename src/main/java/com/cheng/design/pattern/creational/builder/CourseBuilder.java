package com.cheng.design.pattern.creational.builder;

/**
 * @author cheng
 *         2018/10/26 11:51
 */
public abstract class CourseBuilder {

    public abstract Course makeCourse();

    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);
}
