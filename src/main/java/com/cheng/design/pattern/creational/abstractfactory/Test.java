package com.cheng.design.pattern.creational.abstractfactory;

/**
 * @author cheng
 *         2018/10/25 14:12
 */
public class Test {
    public static void main(String[] args) {

        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
