package com.ly.pattern.behavioral.chainofresponsibility.demo;

public class InstallHandler implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle() {
        System.out.println("开始部署");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("部署成功");

        if (next != null) {
            next.handle();
        }
    }
}
