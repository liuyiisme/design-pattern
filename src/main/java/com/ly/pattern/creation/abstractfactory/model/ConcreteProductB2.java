package com.ly.pattern.creation.abstractfactory.model;

/**
 * 产品实现B2
 */
public class ConcreteProductB2 implements ProductB {
    @Override
    public void handle() {
        System.out.println("ConcreteProductB2 handle bussiness");
    }
}
