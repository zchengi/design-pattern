package com.cheng.design.behavioral.visitor;

/**
 * @author cheng
 *         2018/11/18 18:27
 */
public abstract class Course {

    private String name;

    public abstract void accept(IVisitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
