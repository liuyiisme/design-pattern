package com.ly.pattern.behavioral.templatemethod.model;

/**
 * 具体模板实现类
 */
public class ConcreteTemplate extends AbstractTemplate {
    @Override
    protected void handle2() {
        System.out.println("ConcreteTemplate handle2 bussiness");
    }

    @Override
    protected void handle3() {
        System.out.println("ConcreteTemplate handle3 bussiness");
    }
}
