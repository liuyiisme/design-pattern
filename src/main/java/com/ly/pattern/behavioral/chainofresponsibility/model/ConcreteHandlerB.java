package com.ly.pattern.behavioral.chainofresponsibility.model;
/**
 * 处理接口实现类B
 */
public class ConcreteHandlerB implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle() {
        System.out.println("ConcreteHandlerB handle bussiness");
        if (next != null) {
            next.handle();
        }
    }
}
