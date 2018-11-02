package com.cheng.design.pattern.structural.proxy.staticproxy;

import com.cheng.design.pattern.structural.proxy.Order;
import com.cheng.design.pattern.structural.proxy.OrderService;
import com.cheng.design.pattern.structural.proxy.OrderServiceImpl;
import com.cheng.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * 静态代理类
 *
 * @author cheng
 *         2018/11/2 11:43
 */
public class OrderServiceStaticProxy {

    private OrderService orderService;

    public int saveOrder(Order order) {
        orderService = new OrderServiceImpl();

        beforeMethod(order);
        int result = orderService.saveOrder(order);
        afterMethod();

        return result;
    }

    private void beforeMethod(Order order) {

        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到 [db" + dbRouter + "] 处理数据");

        // todo 设置 dataSource
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));

        System.out.println("静态代理 before core");
    }

    private void afterMethod() {
        System.out.println("静态代理 after core");
    }
}
