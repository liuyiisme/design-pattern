package com.ly.pattern.creation.builder.model;

/**
 * 建造者实现类
 */
public class ConcreteBuilder extends AbstractBuilder {

    @Override
    public Product getResult() {
        return product;
    }

    @Override
    public void buildPartA() {
        product.setPartA("构建部分A");
    }

    @Override
    public void buildPartB() {
        product.setPartA("构建部分B");
    }
}
