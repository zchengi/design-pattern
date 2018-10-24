package com.cheng.design.principle.openclose;

/**
 * @author cheng
 *         2018/10/24 13:01
 */
public class Test {
    public static void main(String[] args) {

//        ICourse javaCourse = new JavaCourse(96, "java从入门到放弃", 999D);
        ICourse iCourse = new JavaDiscountCourse(96, "java从入门到放弃", 999D);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;

        System.out.println("课程ID: " + javaCourse.getId());
        System.out.println("课程名称: " + javaCourse.getName());
        System.out.println("课程原价: " + javaCourse.getOriginPrice());
        System.out.println("课程折后价: " + javaCourse.getPrice());
    }
}
