package com.ly.pattern.creation.factory.factorymethod.model;

/**
 * 工厂实现类A
 */
public class ConcreteFactoryA extends AbstractFactory {
    // 子工厂A实现创建产品A
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
