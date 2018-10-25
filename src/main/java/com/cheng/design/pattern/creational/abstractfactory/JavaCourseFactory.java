package com.cheng.design.pattern.creational.abstractfactory;

/**
 * @author cheng
 *         2018/10/25 14:05
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
