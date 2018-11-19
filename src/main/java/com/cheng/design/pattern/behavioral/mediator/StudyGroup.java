package com.cheng.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @author cheng
 *         2018/11/15 15:31
 */
public class StudyGroup {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
