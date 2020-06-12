package com.ly.pattern.behavioral.state.demo;

public class NewState implements ThreadState {
    @Override
    public void handle(Context context) {
        System.out.println("NEW状态，线程还未启动");
        context.setState(new RunnableState());
    }
}
