package com.cheng.design.pattern.structural.facade;

/**
 * @author cheng
 *         2018/10/30 14:50
 */
public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过，库存通过");
        return true;
    }
}
