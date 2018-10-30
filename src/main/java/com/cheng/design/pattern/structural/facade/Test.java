package com.cheng.design.pattern.structural.facade;

/**
 * 外观模式
 *
 * @author cheng
 *         2018/10/30 14:58
 */
public class Test {
    public static void main(String[] args) {

        PointsGift pointsGift = new PointsGift("cake");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

//        giftExchangeService.setQualifyService(new QualifyService());
//        giftExchangeService.setPointsPaymentService(new PointsPaymentService());
//        giftExchangeService.setShippingService(new ShippingService());

        giftExchangeService.giftExchange(pointsGift);
    }
}
