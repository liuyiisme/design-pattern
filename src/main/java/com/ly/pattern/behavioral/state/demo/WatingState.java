package com.ly.pattern.behavioral.state.demo;

public class WatingState implements ThreadState {
    @Override
    public void handle(Context context) {
        System.out.println("Wating状态，线程进入了阻塞");
        context.setState(new TimeWatingState());
    }
}
