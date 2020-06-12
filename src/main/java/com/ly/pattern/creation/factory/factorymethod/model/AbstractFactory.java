package com.ly.pattern.creation.factory.factorymethod.model;

/**
 * 抽象工厂类
 */
public abstract class AbstractFactory {
    // 创建抽象产品，由子工厂实现
    public abstract Product createProduct();
}
