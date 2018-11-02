package com.cheng.design.pattern.structural.proxy.dynamicproxy;


import com.cheng.design.pattern.structural.proxy.Order;
import com.cheng.design.pattern.structural.proxy.OrderService;
import com.cheng.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * 动态代理
 *
 * @author cheng
 *         2018/11/2 12:54
 */
public class Test {
    public static void main(String[] args) {

        Order order = new Order();
//        order.setUserId(1);
        order.setUserId(2);

        OrderService orderService =
                (OrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderService.saveOrder(order);
    }
}
