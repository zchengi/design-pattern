package com.cheng.design.pattern.behavioral.chainofresponcesibility;

import org.apache.commons.lang.StringUtils;

/**
 * @author cheng
 *         2018/11/16 13:11
 */
public class ArticleApprover extends Approver {

    @Override
    public void deploy(Course course) {

        if (StringUtils.isNotEmpty(course.getArticle())) {
            System.out.println(course.getName() + " 含有手记，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + " 不含有手记，不批准");
        }
    }
}
