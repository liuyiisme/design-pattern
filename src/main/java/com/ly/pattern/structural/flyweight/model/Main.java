package com.ly.pattern.structural.flyweight.model;

/**
 * 享元模式(Flyweight)
 * 使用场景：系统中存在大量相似对象
 * JAVA中的场景：
 * java.lang.String#intern()，数据会存放常量池
 * java.lang.Integer#valueOf(int)，会缓存-127,126范围
 * java.lang.Boolean#valueOf(boolean)
 * java.lang.Byte#valueOf(byte)
 * java.lang.Character#valueOf(char)
 * 开源实现场景：
 * c3p0连接池
 * mybatis一级缓存，会把sql执行的结果放入session
 * spring三级缓存池中的单例缓存池org.springframework.beans.factory.support.DefaultSingletonBeanRegistry#singletonObjects
 */
public class Main {
    public static void main(String[] args) {
        Flyweight flyweight = FlyweightFactory.getFlyweight("A");
        flyweight.method();
    }
}
