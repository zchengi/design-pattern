package com.cheng.design.principle.compositionaggregation;

/**
 * @author cheng
 *         2018/11/29 16:33
 */
public class PostgreSQLConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
