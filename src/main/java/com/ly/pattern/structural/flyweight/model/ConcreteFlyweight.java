package com.ly.pattern.structural.flyweight.model;

/**
 * 享元接口实现类
 */
public class ConcreteFlyweight implements Flyweight {
    @Override
    public void method() {
        System.out.println("ConcreteFlyweight.method()被调用");
    }
}
