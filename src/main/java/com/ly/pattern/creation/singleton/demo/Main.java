package com.ly.pattern.creation.singleton.demo;

/**
 * 需求：加载Jdbc配置文件,只允许加载一次
 */
public class Main {
    public static void main(String[] args) {
        JdbcProperties singleton = JdbcProperties.createSingleton();
        String url = singleton.getProperty("datasource.url");
        System.out.println(url);
    }
}
