package com.cheng.design.pattern.structural.decorator.v2;

/**
 * 装饰者模式
 *
 * @author cheng
 *         2018/10/30 15:34
 */
public class Test {

    public static void main(String[] args) {
        AbstractBatterCake abstractBatterCake;
        abstractBatterCake = new BatterCake();

        abstractBatterCake = new EggDecorator(abstractBatterCake);
        abstractBatterCake = new EggDecorator(abstractBatterCake);
        abstractBatterCake = new SausageDecorator(abstractBatterCake);

        System.out.println(abstractBatterCake.getDesc() + " 销售价格：" + abstractBatterCake.getCost());
    }
}
