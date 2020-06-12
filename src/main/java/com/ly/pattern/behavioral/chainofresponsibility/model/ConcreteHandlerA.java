package com.ly.pattern.behavioral.chainofresponsibility.model;

/**
 * 处理接口实现类A
 */
public class ConcreteHandlerA implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle() {
        System.out.println("ConcreteHandlerA handle bussiness");
        if (next != null) {
            next.handle();
        }
    }
}
