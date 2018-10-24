package com.cheng.design.principle.singleresponsebility;

/**
 * @author cheng
 *         2018/10/24 14:18
 */
public interface ICourse {

    String getCourseName();

    byte[] getCourseVideo();

    void studyCourse();

    void refundCourse();
}
