package com.cheng.design.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂
 *
 * @author cheng
 *         2018/11/12 21:44
 */
public class PromotionStrategyFactory {

    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManjianPromotionStrategy());
    }

    private PromotionStrategyFactory() {}

    public static PromotionStrategy getPromotionStrategy(String PromotionKey) {
        return PROMOTION_STRATEGY_MAP.get(PromotionKey) == null ?
                NON_PROMOTION : PROMOTION_STRATEGY_MAP.get(PromotionKey);
    }

    private interface PromotionKey {
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
    }
}
