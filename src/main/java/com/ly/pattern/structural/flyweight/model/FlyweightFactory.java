package com.ly.pattern.structural.flyweight.model;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 */
public class FlyweightFactory {
    private static final Map<String, Flyweight> POOL = new HashMap<>();

    public static Flyweight getFlyweight(String key) {
        if (!POOL.containsKey(key)) {
            Flyweight flyweight = new ConcreteFlyweight();
            POOL.put(key, flyweight);
        }
        return POOL.get(key);
    }

}
