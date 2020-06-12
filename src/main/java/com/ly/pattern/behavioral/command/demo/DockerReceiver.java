package com.ly.pattern.behavioral.command.demo;

public class DockerReceiver implements Receiver {
    public void start() {
        System.out.println("Docker start");
    }

    public void stop() {
        System.out.println("Docker stop");
    }

    public void restart() {
        System.out.println("Docker restart");
    }
}
