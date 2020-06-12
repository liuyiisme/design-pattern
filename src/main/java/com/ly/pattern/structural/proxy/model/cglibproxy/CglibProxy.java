package com.ly.pattern.structural.proxy.model.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    private Object obj;

    public CglibProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        beforeHandle();
        Object result = proxy.invoke(obj, args);
        afterHandle();
        return result;
    }

    public void beforeHandle() {
        System.out.println("CglibProxy beforeHandle bussiness");
    }

    public void afterHandle() {
        System.out.println("CglibProxy afterHandle bussiness");
    }

    public Object createProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setInterfaces(obj.getClass().getInterfaces());
        enhancer.setCallback(this);
        Object result = enhancer.create();
        return result;
    }
}
