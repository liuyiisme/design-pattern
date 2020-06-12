package com.ly.pattern.structural.flyweight.demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元工厂类
 */
public class PropertiesFactory {
    private static final Map<String, Properties> POOL = new ConcurrentHashMap<>();

    public static Properties getProperties(String path) {
        if (!POOL.containsKey(path)) {
            Properties properties = loadProperties(path);
            POOL.put(path, properties);
        }
        return POOL.get(path);
    }

    private static Properties loadProperties(String path) {
        Properties properties = new Properties();
        InputStream is = null;
        try {
            is = PropertiesFactory.class.getClassLoader().getResourceAsStream(path);
            properties.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return properties;
    }

}
