package com.cheng.design.principle.compositionaggregation;

/**
 * @author cheng
 *         2018/11/29 16:33
 */
public class MySQLConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
