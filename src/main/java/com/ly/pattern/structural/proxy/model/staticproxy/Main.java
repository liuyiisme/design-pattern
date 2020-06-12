package com.ly.pattern.structural.proxy.model.staticproxy;

/**
 * 代理模式(Proxy)
 * 使用场景：方法增强
 * JAVA中的场景：
 * java.lang.reflect.Proxy
 * java.rmi.*
 * 开源实现场景：
 * Spring AOP方法拦截，添加事务
 * Mycat中间件拦截SQL，实现读写分离
 */
public class Main {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject proxySubject = new ProxySubject(realSubject);
        proxySubject.handle();
    }
}
