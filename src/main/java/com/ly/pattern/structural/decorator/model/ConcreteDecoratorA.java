package com.ly.pattern.structural.decorator.model;

/**
 * 装饰者实现类A
 */
public class ConcreteDecoratorA extends AbstractDecorator {
    public ConcreteDecoratorA(Subject subject) {
        super(subject);
    }

    public void handle(){
        subject.handle();
        System.out.println("ConcreteDecoratorA handle bussiness");
    }
}
