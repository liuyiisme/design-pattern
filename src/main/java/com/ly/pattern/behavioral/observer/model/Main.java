package com.ly.pattern.behavioral.observer.model;

/**
 * 观察者模式(Observer)
 * 使用场景：主题变化通知观察者
 * JAVA中的场景：
 * java.util.Observer/java.util.Observable
 * java.util.EventListener (所有子类)
 * javax.servlet.http.HttpSessionBindingListener
 * javax.servlet.http.HttpSessionAttributeListener
 * 开源实现场景：
 * MQ的实现
 * spring启动监听器org.springframework.context.ApplicationListener#onApplicationEvent(ApplicationEvent)
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.addObserver(new ObserverA());
        subject.addObserver(new ObserverB());
        subject.notifyObservers();
    }
}
