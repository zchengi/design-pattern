package com.cheng.design.pattern.structural.decorator.v1;

/**
 * 装饰者模式: 单继承
 * 会发生类爆炸情况
 *
 * @author cheng
 *         2018/10/30 15:25
 */
public class Test {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc() + " 销售价格：" + batterCake.getCost());

        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc() + " 销售价格：" + batterCakeWithEgg.getCost());

        BatterCakeWithEggSausage batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc() + " 销售价格：" + batterCakeWithEggSausage.getCost());
    }
}
