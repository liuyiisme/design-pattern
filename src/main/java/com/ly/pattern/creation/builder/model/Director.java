package com.ly.pattern.creation.builder.model;

/**
 * 指挥者实现类
 */
public class Director {
    private AbstractBuilder builder;

    // 传递一个具体建造者，指挥构建
    public Director(AbstractBuilder builder) {
        this.builder = builder;
        builder.buildPartA();
        builder.buildPartB();
    }

    // 返回大对象给客户端使用
    public Product getResult() {
        return builder.getResult();
    }
}
