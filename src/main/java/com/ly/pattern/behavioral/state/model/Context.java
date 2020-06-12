package com.ly.pattern.behavioral.state.model;

/**
 * 环境类
 */
public class Context {
    private State state;

    public Context() {
        state = new ConcreteStateA();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle() {
        state.handle(this);
    }
}
