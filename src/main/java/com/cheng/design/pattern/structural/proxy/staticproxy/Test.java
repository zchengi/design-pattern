package com.cheng.design.pattern.structural.proxy.staticproxy;

import com.cheng.design.pattern.structural.proxy.Order;

/**
 * 静态代理
 *
 * @author cheng
 *         2018/11/2 12:08
 */
public class Test {
    public static void main(String[] args) {

        Order order = new Order();
//        order.setUserId(1);
        order.setUserId(2);
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
