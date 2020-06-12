package com.ly.pattern.creation.factory.simplefactory.model;

/**
 * 简单工厂类
 */
public class Factory {
    // 创建产品对象
    public static Product createProduct(String type) {
        if (type.equals("A")) {
            return new ConcreteProductA();
        } else if (type.equals("B")) {
            return new ConcreteProductB();
        }
        return null;
    }
}
