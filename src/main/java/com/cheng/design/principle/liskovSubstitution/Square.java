package com.cheng.design.principle.liskovSubstitution;

/**
 * @author cheng
 *         2018/11/29 15:20
 */
public class Square implements Quadrangle {

    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getLength() {
        return getSideLength();
    }


    @Override
    public long getWidth() {
        return getSideLength();
    }
}
