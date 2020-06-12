package com.ly.pattern.structural.decorator.model;

/**
 * 装饰者实现类B
 */
public class ConcreteDecoratorB extends AbstractDecorator {
    public ConcreteDecoratorB(Subject subject) {
        super(subject);
    }

    public void handle(){
        subject.handle();
        System.out.println("ConcreteDecoratorB handle bussiness");
    }

    public void handle2(){
        System.out.println("ConcreteDecoratorB handle2 bussiness");
    }
}
