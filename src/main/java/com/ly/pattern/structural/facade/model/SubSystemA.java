package com.ly.pattern.structural.facade.model;

/**
 * 子系统实现类A
 */
public class SubSystemA implements Subject {
    @Override
    public void handle() {
        System.out.println("SubSystemA handle bussiness");
    }
}
