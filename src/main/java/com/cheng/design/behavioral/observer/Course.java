package com.cheng.design.behavioral.observer;

import java.util.Observable;

/**
 * @author cheng
 *         2018/11/13 23:54
 */
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.getCourseName() + "提交了一个问题");
        setChanged();
        notifyObservers(question);
    }

    public String getCourseName() {
        return courseName;
    }
}
