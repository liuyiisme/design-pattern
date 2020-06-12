package com.ly.pattern.behavioral.state.demo;

public class TerminatedState implements ThreadState {
    @Override
    public void handle(Context context) {
        System.out.println("Terminated状态，线程执行任务结束，调用exit方法退出并清理threadlocal对象");
        context.setState(null);
    }
}
