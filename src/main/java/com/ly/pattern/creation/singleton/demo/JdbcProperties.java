package com.ly.pattern.creation.singleton.demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JdbcProperties {

    private String filePath = "META-INF/jdbc.properties";

    private Properties prop = new Properties();

    private volatile static JdbcProperties singleton;

    private JdbcProperties() {
        loadPropertis();
    }

    public static final JdbcProperties createSingleton() {
        if (singleton == null) {
            synchronized (JdbcProperties.class) {
                if (singleton == null) {
                    singleton = new JdbcProperties();
                }
            }
        }
        return singleton;
    }

    private void loadPropertis() {
        InputStream is = null;
        try {
            is = getClass().getClassLoader().getResourceAsStream(filePath);
            prop.load(is);
        } catch (IOException e) {
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
    }

    public String getProperty(String key) {
        return prop.getProperty(key);
    }
}
