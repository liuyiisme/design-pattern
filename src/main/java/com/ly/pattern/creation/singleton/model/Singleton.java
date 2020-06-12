package com.ly.pattern.creation.singleton.model;

/**
 * 双重检索单例
 */
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static final Singleton createSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public void handle(){
        System.out.println("Singleton handle bussiness");
    }
}
