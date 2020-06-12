package com.ly.pattern.structural.proxy.model.cglibproxy;

/**
 * 代理模式(Proxy)
 * 使用场景：不能代理final方法，可以用在没有接口的类(代理类继承类)
 * JAVA中的场景：
 * 开源实现场景：
 * Spring AOP方法增强，用在没有实现接口的类
 */
public class Main {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        RealSubject proxySubject = (RealSubject) new CglibProxy(realSubject).createProxy();
        proxySubject.handle();
    }
}
