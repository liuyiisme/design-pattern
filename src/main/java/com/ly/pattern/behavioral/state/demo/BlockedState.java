package com.ly.pattern.behavioral.state.demo;

public class BlockedState implements ThreadState {
    @Override
    public synchronized void handle(Context context) {
        System.out.println("Blocked状态，线程被synchronized阻塞了");
        context.setState(new WatingState());
    }
}
