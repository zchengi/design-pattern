package com.cheng.design.pattern.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例
 * - 可能产生多线程线程不安全问题
 *
 * @author cheng
 *         2018/10/27 12:32
 */
public class ContainerSingleton {

    private static Map<String, Object> singletonMap = new HashMap<>();

    private ContainerSingleton() {
    }

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
