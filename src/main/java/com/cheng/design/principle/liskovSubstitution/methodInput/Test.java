package com.cheng.design.principle.liskovSubstitution.methodInput;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cheng
 *         2018/11/29 15:56
 */
public class Test {
    public static void main(String[] args) {

        Child child = new Child();
        System.out.println(child.method(new HashMap()));

        Map map = new HashMap();
        child.method(map);
    }
}
