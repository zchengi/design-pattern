package com.cheng.design.pattern.behavioral.templetemethod;

/**
 * @author cheng
 *         2018/11/4 13:39
 */
public abstract class AbstractCourse {

    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作Video");
    }

    void writeArticle() {
        System.out.println("编写手记");
    }

    // 钩子方法
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();
}
