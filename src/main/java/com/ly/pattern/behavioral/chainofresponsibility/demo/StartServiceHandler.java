package com.ly.pattern.behavioral.chainofresponsibility.demo;

public class StartServiceHandler implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle() {
        System.out.println("开始启动服务");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("启动服务成功");

        if (next != null) {
            next.handle();
        }
    }
}
