package com.cheng.design.pattern.behavioral.visitor;

/**
 * @author cheng
 *         2018/11/18 18:28
 */
public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}
