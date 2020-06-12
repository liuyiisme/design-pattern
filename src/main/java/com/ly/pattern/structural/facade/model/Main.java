package com.ly.pattern.structural.facade.model;

/**
 * 外观模式(Facade)
 * 使用场景：提供一个门面类供客户端调用
 * JAVA中的场景：
 * java.lang.Class(获取类名字，类加载器，类结构信息)
 * 开源实现场景：
 * springmvc处理所有请求org.springframework.web.servlet.DispatcherServlet#doService(HttpServletRequest, HttpServletResponse)
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.handleA();
        facade.handleB();
    }
}
