package com.cheng.design.pattern.behavioral.strategy;

/**
 * @author cheng
 *         2018/11/12 21:47
 */
public class EmptyPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("无促销");
    }
}
