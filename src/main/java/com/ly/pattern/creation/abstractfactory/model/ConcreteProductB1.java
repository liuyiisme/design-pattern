package com.ly.pattern.creation.abstractfactory.model;

/**
 * 产品实现B1
 */
public class ConcreteProductB1 implements ProductB {
    @Override
    public void handle() {
        System.out.println("ConcreteProductB1 handle bussiness");
    }
}
