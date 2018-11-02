package com.cheng.design.pattern.structural.proxy;

/**
 * @author cheng
 *         2018/11/2 11:40
 */
public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao;

    @Override
    public int saveOrder(Order order) {

        // Spring 会自己注入，这里直接new
        orderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return orderDao.insert(order);
    }
}
