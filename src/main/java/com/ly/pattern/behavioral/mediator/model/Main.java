package com.ly.pattern.behavioral.mediator.model;

/**
 * 中介者模式(Mediator)
 * 使用场景：1、降低了类的复杂度，将一对多转化成了一对一。 2、各个类之间的解耦。 3、符合迪米特原则。
 * JAVA中的场景：
 * java.util.Timer (所有scheduleXXX()方法)
 * java.util.concurrent.Executor#execute()
 * java.util.concurrent.ExecutorService (invokeXXX()和submit()方法)
 * java.util.concurrent.ScheduledExecutorService (所有scheduleXXX()方法)
 * java.lang.reflect.Method#invoke()
 * 开源实现场景：
 * Spring IOC容器，通过注解得到Bean，然后Bean与Bean之间就可以相互通信
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleagueA = new ConcreteCollagueA(mediator);
        Colleague colleagueB = new ConcreteCollagueB(mediator);
        colleagueA.send();
        colleagueB.send();
    }
}
