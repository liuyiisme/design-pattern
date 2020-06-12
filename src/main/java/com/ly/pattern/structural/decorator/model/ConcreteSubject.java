package com.ly.pattern.structural.decorator.model;

/**
 * 主题实现类
 */
public class ConcreteSubject implements Subject {
    @Override
    public void handle() {
        System.out.println("ConcreteSubject handle bussiness");
    }
}
