package com.cheng.design.principle.denpendenceinversion;

/**
 * @author cheng
 *         2018/10/24 13:24
 */
public class Cheng {

    private ICourse iCourse;

/*
    public Cheng(ICourse iCourse) {
        this.iCourse = iCourse;
    }
*/

    public void studyCourse() {
        iCourse.studyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}

