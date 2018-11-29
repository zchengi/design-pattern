package com.cheng.design.principle.compositionaggregation;

/**
 * @author cheng
 *         2018/11/29 16:30
 */
public class ProductDao {

    private DBConnection dbConnection;

    public ProductDao(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用 " + conn + " 增加产品");
    }
}
