package com.ly.pattern.behavioral.observer.model;

/**
 * 观察者实现类B
 */
public class ObserverB implements Observer {
    @Override
    public void update() {
        System.out.println("ObserverB get update");
        handle();
    }

    private void handle() {
        System.out.println("ObserverB handle bussiness");
    }
}
