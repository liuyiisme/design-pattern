package com.ly.pattern.behavioral.visitor.model;

/**
 * 抽象元素接口
 */
public interface Element {
    // 接收访问者
    void accept(Visitor visitor);

    String getValue();
}
