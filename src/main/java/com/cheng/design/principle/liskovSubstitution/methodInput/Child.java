package com.cheng.design.principle.liskovSubstitution.methodInput;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cheng
 *         2018/11/29 15:36
 */
public class Child extends Base {

    @Override
    public HashMap method(HashMap map) {
        System.out.println("子类被执行");
        HashMap hashMap = new HashMap();
        hashMap.put("message", "子类 method 被执行");
        return hashMap;
    }

    public void method(Map map) {
        System.out.println("子类 Map 入参方法被执行");
    }
}
