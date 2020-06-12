package com.ly.pattern.behavioral.observer.model;

/**
 * 观察者实现类A
 */
public class ObserverA implements Observer {
    @Override
    public void update() {
        System.out.println("ObserverA get update");
        handle();
    }

    private void handle() {
        System.out.println("ObserverA handle bussiness");
    }

}
