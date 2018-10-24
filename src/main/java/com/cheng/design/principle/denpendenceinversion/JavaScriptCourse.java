package com.cheng.design.principle.denpendenceinversion;

/**
 * @author cheng
 *         2018/10/24 13:28
 */
public class JavaScriptCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("cheng 在学习JavaScript课程");
    }
}
