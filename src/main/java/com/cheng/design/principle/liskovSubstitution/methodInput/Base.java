package com.cheng.design.principle.liskovSubstitution.methodInput;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cheng
 *         2018/11/29 15:35
 */
public class Base {

    public Map method(HashMap map) {
        System.out.println("父类被执行");
        return map;
    }
}
