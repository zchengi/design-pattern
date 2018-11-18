package com.cheng.design.behavioral.visitor;

/**
 * @author cheng
 *         2018/11/18 18:27
 */
public class CodingCourse extends Course {

    private int price;

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
