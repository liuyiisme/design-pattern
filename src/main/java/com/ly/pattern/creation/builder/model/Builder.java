package com.ly.pattern.creation.builder.model;

/**
 * 抽象建造者接口
 */
public interface Builder {
    // 构建A部分
    void buildPartA();

    // 构建B部分
    void buildPartB();

}
