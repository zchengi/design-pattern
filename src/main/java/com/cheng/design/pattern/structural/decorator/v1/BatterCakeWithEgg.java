package com.cheng.design.pattern.structural.decorator.v1;

/**
 * @author cheng
 *         2018/10/30 15:23
 */
public class BatterCakeWithEgg extends BatterCake {

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }
}
