package com.ly.pattern.behavioral.state.demo;

public class RunnableState implements ThreadState {
    @Override
    public void handle(Context context) {
        System.out.println("Runnable状态，线程正在运行");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        context.setState(new BlockedState());
    }
}
