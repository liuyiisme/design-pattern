package com.ly.pattern.structural.proxy.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class Tomcat implements RequestHandler {
    private static final AtomicInteger atomicInteger = new AtomicInteger(0);

    private int index;

    public Tomcat() {
        this.index = atomicInteger.incrementAndGet();
    }

    @Override
    public void handle() {
        System.out.println("Tomcat" + index + " handle bussiness");
    }

}
