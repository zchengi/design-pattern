package com.cheng.design.pattern.structural.decorator.v2;

/**
 * @author cheng
 *         2018/10/30 15:30
 */
public class BatterCake extends  AbstractBatterCake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int getCost() {
        return 8;
    }
}
