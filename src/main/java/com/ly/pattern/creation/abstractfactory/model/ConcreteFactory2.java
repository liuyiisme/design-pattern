package com.ly.pattern.creation.abstractfactory.model;

/**
 * 工厂实现类2
 */
public class ConcreteFactory2 extends AbstractFactory {
    // 工厂2实现创建产品A2
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }
    // 工厂2实现创建产品B2
    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
