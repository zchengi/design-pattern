package com.cheng.design.behavioral.strategy;

/**
 * @author cheng
 *         2018/11/12 18:02
 */
public class FanXianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存放到用户余额中");
    }
}
