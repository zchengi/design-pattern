package com.cheng.design.pattern.structural.decorator.v2;

/**
 * @author cheng
 *         2018/10/30 15:32
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一根香肠";
    }

    @Override
    protected int getCost() {
        return super.getCost()+2;
    }
}
