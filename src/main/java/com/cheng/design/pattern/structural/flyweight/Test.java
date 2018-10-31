package com.cheng.design.pattern.structural.flyweight;

/**
 * 享元模式
 *
 * @author cheng
 *         2018/10/31 18:16
 */
public class Test {

    private static final String[] departments = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
