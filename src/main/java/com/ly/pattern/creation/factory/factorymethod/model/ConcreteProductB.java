package com.ly.pattern.creation.factory.factorymethod.model;

/**
 * 产品实现类B
 */
public class ConcreteProductB implements Product {
    @Override
    public void handle() {
        System.out.println("ConcreteProductB handle bussiness");
    }
}
