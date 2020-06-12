package com.ly.pattern.creation.builder.model;

/**
 * 抽象建造者类
 */
public abstract class AbstractBuilder implements Builder {
    // 内置一个没有初始化的大对象Product
    protected Product product = new Product();

    // 返回大对象，交给子类实现
    public abstract Product getResult();
}
