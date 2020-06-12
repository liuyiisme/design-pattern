package com.ly.pattern.structural.proxy.demo;

import org.springframework.util.Assert;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class NginxProxy implements InvocationHandler {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private List<RequestHandler> handlerList;

    public NginxProxy(List<RequestHandler> handlerList) {
        Assert.notEmpty(handlerList, "handlerList is empty");
        this.handlerList = handlerList;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        RequestHandler tomcat = getRequestHandler();
        tomcat = before(tomcat);
        Object result = method.invoke(tomcat, args);
        after(tomcat);
        return result;
    }

    private RequestHandler before(RequestHandler handler) {
        // TODO 检查服务是否可用

        // TODO 检查各项指标

        // TODO 是否替换更合适的Tomcat

        // TODO 打开连接

        return handler;
    }

    private void after(RequestHandler handler) {
        // TODO 关闭连接
    }

    private RequestHandler getRequestHandler() {
        if (atomicInteger.get() == Integer.MAX_VALUE) {
            atomicInteger.set(0);
        }
        int index = atomicInteger.getAndIncrement() % handlerList.size();
        return handlerList.get(index);
    }

    public Object getProxy() {
        RequestHandler handler = handlerList.get(0);
        return Proxy.newProxyInstance(handler.getClass().getClassLoader(), handler.getClass().getInterfaces(), this);
    }
}
