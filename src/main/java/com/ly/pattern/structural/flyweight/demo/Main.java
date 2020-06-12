package com.ly.pattern.structural.flyweight.demo;

import java.util.Properties;

/**
 * 需求：实现加载配置文件，并缓存
 */
public class Main {
    public static void main(String[] args) {
        Properties properties = PropertiesFactory.getProperties("META-INF/jdbc.properties");
        System.out.println(properties.getProperty("datasource.driver"));

        Properties properties2 = PropertiesFactory.getProperties("META-INF/jdbc.properties");
        System.out.println(properties2.getProperty("datasource.url"));

        System.out.println(properties == properties2);
    }
}
