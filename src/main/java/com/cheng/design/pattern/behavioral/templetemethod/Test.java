package com.cheng.design.pattern.behavioral.templetemethod;

/**
 * 模版方法模式
 *
 * @author cheng
 *         2018/11/4 13:48
 */
public class Test {
    public static void main(String[] args) {

        System.out.println("后端设计模式课程 start ---");
        AbstractCourse designPatternCourse = new DesignPatternAbstractCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程  end  ---");

        System.out.println("前端课程 start ---");
        AbstractCourse vueCourse = new FECourse(true);
        vueCourse.makeCourse();
        System.out.println("前端课程  end  ---");
    }
}
