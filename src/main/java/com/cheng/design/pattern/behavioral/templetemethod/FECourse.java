package com.cheng.design.pattern.behavioral.templetemethod;

/**
 * @author cheng
 *         2018/11/4 13:44
 */
public class FECourse extends AbstractCourse {

    private boolean needWriteArticleFlag = false;

    public FECourse() {
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端源代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return needWriteArticleFlag;
    }
}
