package com.ly.pattern.structural.facade.model;

/**
 * 子系统实现类B
 */
public class SubSystemB implements Subject {
    @Override
    public void handle() {
        System.out.println("SubSystemB handle bussiness");
    }
}
