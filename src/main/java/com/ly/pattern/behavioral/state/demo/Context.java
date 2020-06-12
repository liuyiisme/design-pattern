package com.ly.pattern.behavioral.state.demo;

public class Context {
    private ThreadState state;

    public Context() {
        // 初始状态
        this.state = new NewState();
    }

    public void setState(ThreadState state) {
        this.state = state;
    }

    public void handle() {
        if (state != null) {
            state.handle(this);
        }
    }
}
