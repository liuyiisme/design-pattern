package com.ly.pattern.structural.bridge.model;

/**
 * 桥接模式(Bridge)
 * 使用场景：api.jar和api-impl.jar
 * JAVA中的场景：
 * AWT (提供了抽象层映射于实际的操作系统)
 * JDBC
 * 开源实现场景：
 * slf4j(slf4j日志规范+slf4j的实现)
 * jpa(jpa规范+jpa的实现)
 * servlet(servlet-api规范+容器的实现)
 */
public class Main {
    public static void main(String[] args) {
        Abstraction abstraction = new RefindAbstraction(new ConcreteImplamentor());
        abstraction.handle();
    }
}
