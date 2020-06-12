package com.ly.pattern.creation.singleton.model;

/**
 * 单例模式(Singletone)
 * 使用场景：一次加载，多出使用。工具类、属性类、枚举
 * JAVA中的场景：
 * java.lang.Runtime#getRuntime()
 * java.awt.Desktop#getDesktop()
 * 开源实现场景：
 * servlet单例多线程
 * spring ioc容器中的bean默认单例
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.createSingleton();
        singleton.handle();
    }
}
