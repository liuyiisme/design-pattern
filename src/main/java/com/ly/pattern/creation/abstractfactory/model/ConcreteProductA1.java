package com.ly.pattern.creation.abstractfactory.model;

/**
 * 产品实现类A1
 */
public class ConcreteProductA1 implements ProductA {
    @Override
    public void handle() {
        System.out.println("ConcreteProductA1 handle bussiness");
    }
}
