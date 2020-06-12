package com.ly.pattern.behavioral.templatemethod.model;

/**
 * 抽象模板类
 */
public abstract class AbstractTemplate {

    public void handle() {
        handle1();
        handle2();
        handle3();
    }

    protected void handle1() {
        System.out.println("AbstractTemplate.handle1()被调用了");
    }

    protected abstract void handle2();

    protected abstract void handle3();
}
