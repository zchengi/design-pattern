package com.cheng.design.pattern.structural.bridge;

/**
 * @author cheng
 *         2018/11/1 13:10
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行帐号");
        account.openAccount();
        return account;
    }
}
