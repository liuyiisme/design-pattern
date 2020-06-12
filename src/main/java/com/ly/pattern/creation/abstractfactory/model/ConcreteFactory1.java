package com.ly.pattern.creation.abstractfactory.model;

/**
 * 工厂实现类1
 */
public class ConcreteFactory1 extends AbstractFactory {
    // 工厂1实现创建产品A1
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    // 工厂1实现创建产品B1
    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
