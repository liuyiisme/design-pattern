package com.ly.pattern.behavioral.state.model;

/**
 * 状态模式(State)
 * 使用场景：带状态的责任链模式，解耦多任务混杂在一起，一种状态一种行为，职责单一
 * JAVA中的场景：
 * java.util.Iterator
 * java.lang.Thread.State，线程生命周期有NEW-RUNNABLE-BLOCKED-WAITING-TIMED_WAITING-TERMINATED 6种状态
 * java.util.concurrent.ThreadPoolExecutor.runState线程池生命周期有RUNNING-SHUTDOWN-STOP-TIDYING-TERMINATED 5种状态
 * 开源实现场景：
 * servlet生命周期 init-service-destroy
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.handle();
        context.handle();
    }
}
