package com.ly.pattern.structural.decorator.model;

/**
 * 抽象装饰者类
 */
public abstract class AbstractDecorator implements Subject {
    // 内置一个主题对象
    protected Subject subject;

    public AbstractDecorator(Subject subject) {
        this.subject = subject;
    }
}
