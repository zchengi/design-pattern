package com.cheng.design.pattern.structural.proxy;

/**
 * @author cheng
 *         2018/11/2 11:40
 */
public class OrderDaoImpl implements OrderDao {

    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
