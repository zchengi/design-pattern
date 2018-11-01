package com.cheng.design.pattern.structural.bridge;

/**
 * @author cheng
 *         2018/11/1 13:03
 */
public class SavingAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开活期帐号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期帐号");
    }
}
