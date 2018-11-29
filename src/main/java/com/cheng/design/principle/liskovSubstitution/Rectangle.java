package com.cheng.design.principle.liskovSubstitution;

/**
 * @author cheng
 *         2018/11/29 15:18
 */
public class Rectangle implements Quadrangle{

    private long length;
    private long width;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
