package com.cheng.design.pattern.structural.bridge;

/**
 * @author cheng
 *         2018/11/1 13:04
 */
public abstract class Bank  {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();

    public void setAccount(Account account) {
        this.account = account;
    }
}
