package com.ly.pattern.structural.bridge.model;

/**
 * 实现层实现类
 */
public class ConcreteImplamentor implements Implamentor {
    @Override
    public void handle() {
        System.out.println("ConcreteImplamentor handle bussiness");
    }
}
