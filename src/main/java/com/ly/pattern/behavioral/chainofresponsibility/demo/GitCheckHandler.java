package com.ly.pattern.behavioral.chainofresponsibility.demo;

public class GitCheckHandler implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle() {
        System.out.println("开始检查Git分支是否有更新");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("检查到Git分支有更新");

        if (next != null) {
            next.handle();
        }
    }
}
