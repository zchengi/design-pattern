package com.cheng.design.behavioral.strategy;

/**
 * 策略模式
 *
 * @author cheng
 *         2018/11/12 18:07
 */
public class Test {
    public static void main(String[] args) {

        // version 1
        /*PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();*/

        /*PromotionActivity promotionActivity = null;
        String promotionKey = "LIJIAN";

        // version 2
        if (StringUtils.equals(promotionKey, "LIJIAN")) {
            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
        } else if (StringUtils.equals(promotionKey, "MANJIAN")) {
            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
        } // ......

        promotionActivity.executePromotionStrategy();*/

        // version 3
//        String promotionKey = "MANJIAN";
//        String promotionKey = "LIJIAN";
        String promotionKey = "NON";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}
