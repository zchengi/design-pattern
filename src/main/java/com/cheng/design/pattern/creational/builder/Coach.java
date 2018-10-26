package com.cheng.design.pattern.creational.builder;

/**
 * @author cheng
 *         2018/10/26 11:57
 */
public class Coach {

    private CourseBuilder courseBuilder;

    public Course makeCourse(String courseName, String coursePPT, String courseVideo,
                             String courseArticle, String courseQA) {
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courseQA);

        return this.courseBuilder.makeCourse();
    }

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }
}
