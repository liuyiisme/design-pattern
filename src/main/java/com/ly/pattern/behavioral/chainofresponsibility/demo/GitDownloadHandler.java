package com.ly.pattern.behavioral.chainofresponsibility.demo;

public class GitDownloadHandler implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle() {
        System.out.println("发现git分支代码有新的提交，开始执行更新代码");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("更新代码完成");

        if (next != null) {
            next.handle();
        }
    }
}
