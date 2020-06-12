package com.ly.pattern.behavioral.chainofresponsibility.demo;

public class RollBackServiceHandler implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle() {
        System.out.println("开始回滚");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("回滚结束");

        if (next != null) {
            next.handle();
        }
    }
}
