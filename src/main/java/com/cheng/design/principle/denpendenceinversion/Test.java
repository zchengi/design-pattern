package com.cheng.design.principle.denpendenceinversion;

/**
 * @author cheng
 *         2018/10/24 13:25
 */
public class Test {
    public static void main(String[] args) {

        // 版本1 类实现
//        Cheng cheng = new Cheng();
//        cheng.studyJavaCourse();
//        cheng.studyJavaScriptCourse();
//        cheng.studyPythonCourse();

        // 版本2 接口方法注入
//        Cheng cheng = new Cheng();
//        cheng.studyCourse(new JavaCourse());
//        cheng.studyCourse(new JavaScriptCourse());
//        cheng.studyCourse(new PythonCourse());

        // 版本3 构造器注入
//        Cheng cheng = new Cheng(new JavaCourse());
//        cheng.studyCourse();

        // 版本4 setter 注入
        Cheng cheng = new Cheng();

        cheng.setiCourse(new JavaCourse());
        cheng.studyCourse();
        cheng.setiCourse(new JavaScriptCourse());
        cheng.studyCourse();
    }
}
