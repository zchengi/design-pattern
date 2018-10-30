package com.cheng.design.pattern.structural.decorator.v2;

/**
 * @author cheng
 *         2018/10/30 15:32
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 2;
    }
}
