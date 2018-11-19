package com.cheng.design.pattern.behavioral.chainofresponcesibility;

/**
 * @author cheng
 *         2018/11/16 13:09
 */
public abstract class Approver {

    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
