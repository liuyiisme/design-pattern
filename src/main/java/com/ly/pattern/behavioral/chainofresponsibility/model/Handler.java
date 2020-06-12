package com.ly.pattern.behavioral.chainofresponsibility.model;

/**
 * 抽象处理接口
 */
public interface Handler {
    void handle();
    void setNext(Handler handler);
}
