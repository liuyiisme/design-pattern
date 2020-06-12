package com.ly.pattern.creation.factory.factorymethod.model;

/**
 * 工厂实现类B
 */
public class ConcreteFactoryB extends AbstractFactory {
    // 子工厂B实现创建产品B
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
