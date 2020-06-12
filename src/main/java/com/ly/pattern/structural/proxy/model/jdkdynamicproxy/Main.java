package com.ly.pattern.structural.proxy.model.jdkdynamicproxy;

/**
 * 代理模式(Proxy)
 * 使用场景：JDK动态代理，只能用在实现了接口的类（代理类实现接口）
 * JAVA中的场景：
 * 开源实现场景：
 * Spring AOP实现方法增强，用在实现了接口的类。默认使用JDK动态代理，性能比CGLIB快
 */
public class Main {
    public static void main(String[] args) {
        // 将代理类写到磁盘上，在项目根目录下可以找到
        // System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        RealSubject realSubject = new RealSubject();
        Subject proxySubject = (Subject) new JdkDynamicProxy(realSubject).getProxy();
        proxySubject.handle();
    }
}
