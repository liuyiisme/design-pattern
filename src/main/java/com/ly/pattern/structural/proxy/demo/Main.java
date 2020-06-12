package com.ly.pattern.structural.proxy.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求：模拟nginx-tomcat负载均衡处理请求
 */
public class Main {
    public static void main(String[] args) {
        List<RequestHandler> tomcatList = new ArrayList<>();
        tomcatList.add(new Tomcat());
        tomcatList.add(new Tomcat());
        tomcatList.add(new Tomcat());
        RequestHandler tomcat = (RequestHandler) new NginxProxy(tomcatList).getProxy();
        for (int i = 0; i < 10; i++) {
            tomcat.handle();
        }
    }
}
