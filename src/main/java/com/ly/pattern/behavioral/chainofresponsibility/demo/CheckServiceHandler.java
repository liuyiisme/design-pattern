package com.ly.pattern.behavioral.chainofresponsibility.demo;

public class CheckServiceHandler implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle() {
        System.out.println("开始检查服务是否可用");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("服务可用");

        if (next != null) {
            next.handle();
        }
    }
}
