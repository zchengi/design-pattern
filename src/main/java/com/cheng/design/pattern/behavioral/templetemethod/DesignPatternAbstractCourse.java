package com.cheng.design.pattern.behavioral.templetemethod;

/**
 * @author cheng
 *         2018/11/4 13:44
 */
public class DesignPatternAbstractCourse extends AbstractCourse {

    @Override
    void  packageCourse() {
        System.out.println("提供课程的Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
