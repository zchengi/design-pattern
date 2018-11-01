package com.cheng.design.pattern.structural.bridge;

/**
 * @author cheng
 *         2018/11/1 13:09
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行帐号");
        account.openAccount();
        return account;
    }
}
