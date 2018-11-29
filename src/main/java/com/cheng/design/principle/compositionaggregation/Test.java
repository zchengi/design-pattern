package com.cheng.design.principle.compositionaggregation;

/**
 * 合成复用原则
 *
 * @author cheng
 *         2018/11/29 16:30
 */
public class Test {
    public static void main(String[] args) {

        ProductDao productDao = new ProductDao(new MySQLConnection());
        ProductDao productDao2 = new ProductDao(new PostgreSQLConnection());

        productDao.addProduct();
        productDao2.addProduct();
    }
}
