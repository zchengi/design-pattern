package com.cheng.design.pattern.structural.bridge;

/**
 * @author cheng
 *         2018/11/1 13:03
 */
public class DepositAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开定期帐号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期帐号");
    }
}
