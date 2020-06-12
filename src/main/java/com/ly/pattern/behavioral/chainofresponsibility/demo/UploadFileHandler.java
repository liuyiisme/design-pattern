package com.ly.pattern.behavioral.chainofresponsibility.demo;

public class UploadFileHandler implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle() {
        System.out.println("开始上传部署包");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("上传部署包成功");

        if (next != null) {
            next.handle();
        }
    }
}
