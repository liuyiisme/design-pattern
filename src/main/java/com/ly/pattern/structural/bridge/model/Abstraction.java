package com.ly.pattern.structural.bridge.model;

/**
 * 抽象层抽象类
 */
public abstract class Abstraction {
    protected Implamentor implamentor;

    public Abstraction(Implamentor implamentor) {
        this.implamentor = implamentor;
    }

    public abstract void handle();
}
