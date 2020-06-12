package com.ly.pattern.structural.bridge.model;

/**
 * 抽象层实现类
 */
public class RefindAbstraction extends Abstraction {
    public RefindAbstraction(Implamentor implamentor) {
        super(implamentor);
    }

    @Override
    public void handle() {
        implamentor.handle();
    }
}
