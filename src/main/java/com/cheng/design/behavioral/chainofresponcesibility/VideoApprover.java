package com.cheng.design.behavioral.chainofresponcesibility;

import org.apache.commons.lang.StringUtils;

/**
 * @author cheng
 *         2018/11/16 13:11
 */
public class VideoApprover extends Approver {

    @Override
    public void deploy(Course course) {

        if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println(course.getName() + " 含有视频，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + " 不含有视频，不批准");
        }
    }
}
