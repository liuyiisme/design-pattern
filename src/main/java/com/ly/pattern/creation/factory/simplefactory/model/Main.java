package com.ly.pattern.creation.factory.simplefactory.model;

/**
 * 简单工厂模式(Simple Factory)
 * 使用场景：创建对象
 * JAVA中的场景：
 * 开源实现场景：
 */
public class Main {
    public static void main(String[] args) {
        Factory.createProduct("A").handle();
        Factory.createProduct("B").handle();
    }
}
