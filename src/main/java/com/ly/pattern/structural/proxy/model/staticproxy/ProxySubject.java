package com.ly.pattern.structural.proxy.model.staticproxy;

/**
 * 主题接口代理类
 */
public class ProxySubject implements Subject {
    // 内置一个真实主题对象
    private Subject realSubject;

    public ProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void handle() {
        beforeHandle();
        realSubject.handle();
        afterHandle();
    }

    public void beforeHandle() {
        System.out.println("ProxySubject beforeHandle bussiness");
    }

    public void afterHandle() {
        System.out.println("ProxySubject afterHandle bussiness");
    }
}
