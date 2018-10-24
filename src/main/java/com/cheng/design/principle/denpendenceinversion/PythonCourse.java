package com.cheng.design.principle.denpendenceinversion;

/**
 * @author cheng
 *         2018/10/24 13:27
 */
public class PythonCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("cheng 在学习Python课程");
    }
}
