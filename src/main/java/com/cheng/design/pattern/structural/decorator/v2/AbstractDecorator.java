package com.cheng.design.pattern.structural.decorator.v2;

/**
 * @author cheng
 *         2018/10/30 15:30
 */
public abstract class AbstractDecorator extends AbstractBatterCake {

    private AbstractBatterCake abstractBatterCake;

    public AbstractDecorator(AbstractBatterCake abstractBatterCake) {
        this.abstractBatterCake = abstractBatterCake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.abstractBatterCake.getDesc();
    }

    @Override
    protected int getCost() {
        return this.abstractBatterCake.getCost();
    }
}
