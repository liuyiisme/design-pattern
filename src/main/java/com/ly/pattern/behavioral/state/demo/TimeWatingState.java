package com.ly.pattern.behavioral.state.demo;

public class TimeWatingState implements ThreadState {
    @Override
    public void handle(Context context) {
        System.out.println("TimeWating状态，线程进入了阻塞");
        context.setState(new TerminatedState());
    }
}
