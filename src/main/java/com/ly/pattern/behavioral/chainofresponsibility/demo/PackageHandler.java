package com.ly.pattern.behavioral.chainofresponsibility.demo;

public class PackageHandler implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle() {
        System.out.println("开始执行打包");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("打包成功");

        if (next != null) {
            next.handle();
        }
    }
}
