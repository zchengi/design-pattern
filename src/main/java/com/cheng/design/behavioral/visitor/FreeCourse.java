package com.cheng.design.behavioral.visitor;

/**
 * @author cheng
 *         2018/11/18 18:27
 */
public class FreeCourse extends Course {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
