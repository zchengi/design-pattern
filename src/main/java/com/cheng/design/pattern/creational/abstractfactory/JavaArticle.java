package com.cheng.design.pattern.creational.abstractfactory;

/**
 * @author cheng
 *         2018/10/25 14:05
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("java课程手记");
    }
}
