package com.ly.pattern.creation.factory.factorymethod.model;

/**
 * 产品实现类A
 */
public class ConcreteProductA implements Product {
    @Override
    public void handle() {
        System.out.println("ConcreteProductA handle bussiness");
    }
}
