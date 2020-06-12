package com.ly.pattern.structural.proxy.model.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 主题接口代理类
 */
public class JdkDynamicProxy implements InvocationHandler {
    // 内置一个真实主题对象
    private Object obj;

    public JdkDynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeHandle();
        Object result = method.invoke(obj, args);
        afterHandle();
        return result;
    }

    public void beforeHandle() {
        System.out.println("JdkDynamicProxy beforeHandle bussiness");
    }

    public void afterHandle() {
        System.out.println("JdkDynamicProxy afterHandle bussiness");
    }

    public Object getProxy() {
        /**
         * 生成代理类过程
         * java.lang.reflect.Proxy#newProxyInstance(ClassLoader, Class[], InvocationHandler)入口3个参数
         * java.lang.reflect.Proxy#getProxyClass0(ClassLoader, Class[]) 获取代理类字节码
         * sun.misc.ProxyGenerator#generateProxyClass(java.lang.String, java.lang.Class[], int)生成代理类字节码
         * return cons.newInstance(new Object[]{h});生成代理对象
         */
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), this);
    }
}
