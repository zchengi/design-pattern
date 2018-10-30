package com.cheng.design.pattern.structural.decorator.v1;

/**
 * @author cheng
 *         2018/10/30 15:24
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }
}
