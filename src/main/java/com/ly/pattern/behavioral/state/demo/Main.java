package com.ly.pattern.behavioral.state.demo;

/**
 * 状态模式：Context内聚了一个State实例，当context的业务方法被调用后，会变更状态
 * JAVA中Thread就是使用了状态模式，有6种状态，线程池ThreadPoolExecutor有5种状态
 * 示例：模拟Thread的状态
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}
