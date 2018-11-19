package com.cheng.design.pattern.behavioral.mediator;

/**
 * @author cheng
 *         2018/11/15 15:31
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
