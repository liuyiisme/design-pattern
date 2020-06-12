package com.ly.pattern.structural.proxy.model.staticproxy;

/**
 * 主题接口实现类
 */
public class RealSubject implements Subject {
    @Override
    public void handle() {
        System.out.println("RealSubject handle bussiness");
    }
}
