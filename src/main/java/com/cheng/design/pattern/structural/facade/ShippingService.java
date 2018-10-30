package com.cheng.design.pattern.structural.facade;

/**
 * @author cheng
 *         2018/10/30 14:52
 */
public class ShippingService {

    public String shipGift(PointsGift pointsGift) {
        // 物流系统的对接逻辑
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "222";
        return shippingOrderNo;
    }
}
