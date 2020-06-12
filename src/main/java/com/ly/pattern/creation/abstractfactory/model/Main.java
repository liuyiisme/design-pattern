package com.ly.pattern.creation.abstractfactory.model;

/**
 * 抽象工厂模式(Abstract Factory)
 * 使用场景：
 * 解决了工厂方法模式只能创建一个产品的问题
 * 系统功能有多套实现，通过外界的一个配置项来切换组件的使用
 * 系统有产品族和产品等级的概念
 * JAVA中的场景：
 * java.util.Calendar#getInstance()
 * java.util.Arrays#asList()
 * java.util.ResourceBundle#getBundle()
 * java.net.URL#openConnection()
 * java.sql.DriverManager#getConnection()
 * java.sql.Connection#createStatement()
 * java.sql.Statement#executeQuery()
 * java.text.NumberFormat#getInstance()
 * java.lang.management.ManagementFactory (所有getXXX()方法)
 * java.nio.charset.Charset#forName()
 * javax.xml.parsers.DocumentBuilderFactory#newInstance()
 * javax.xml.transform.TransformerFactory#newInstance()
 * javax.xml.xpath.XPathFactory#newInstance()
 * 开源实现场景：
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory.createFactory(ConcreteFactory1.class).createProductA().handle();
        AbstractFactory.createFactory(ConcreteFactory1.class).createProductB().handle();

//        AbstractFactory.createFactory(ConcreteFactory2.class).createProductA().method();
//        AbstractFactory.createFactory(ConcreteFactory2.class).createProductB().method();
    }
}