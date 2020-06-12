package com.ly.pattern.behavioral.chainofresponsibility.demo;

public interface Handler {
    void handle();

    void setNext(Handler handler);
}
