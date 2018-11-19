package com.cheng.design.pattern.behavioral.strategy;

/**
 * @author cheng
 *         2018/11/12 18:02
 */
public class ManjianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("满减促销，满200-100");
    }
}
