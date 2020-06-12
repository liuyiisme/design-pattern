package com.ly.pattern.behavioral.chainofresponsibility.model;

/**
 * 职责链模式(Chain of Responsibility)
 * 使用场景：解耦多任务混杂在一起，职责单一。比如流程节点处理
 * JAVA中的场景：
 * java.util.logging.Logger#log()
 * javax.servlet.Filter#doFilter()
 * 开源实现场景：
 * 工作流引擎
 */
public class Main {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNext(handlerB);
        handlerA.handle();
    }
}
