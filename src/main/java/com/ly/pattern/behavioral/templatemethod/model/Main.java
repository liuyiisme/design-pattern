package com.ly.pattern.behavioral.templatemethod.model;

/**
 * 模板方法模式(Template Method)
 * 使用场景：抽象模板实现公共特性，模板实现类实现独立变化的特性
 * JAVA中的场景：
 * java.io.InputStream, java.io.OutputStream, java.io.Reader和java.io.Writer的所有非抽象方法
 * java.util.AbstractList, java.util.AbstractSet和java.util.AbstractMap的所有非抽象方法
 * javax.servlet.http.HttpServlet#doXXX()
 * 开源实现场景：
 * 1、Spring中的JdbcTemplate,RestTemplate,RedisTemplate等各种Template
 * 2、IOC容器中的org.springframework.context.support.AbstractApplicationContext#refresh()
 */
public class Main {
    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplate();
        template.handle();
    }
}