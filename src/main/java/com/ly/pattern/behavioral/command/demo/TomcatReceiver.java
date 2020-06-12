package com.ly.pattern.behavioral.command.demo;

public class TomcatReceiver implements Receiver {
    @Override
    public void start() {
        System.out.println("Tomcat start");
    }

    @Override
    public void stop() {
        System.out.println("Tomcat stop");
    }

    @Override
    public void restart() {
        System.out.println("Tomcat restart");
    }
}
