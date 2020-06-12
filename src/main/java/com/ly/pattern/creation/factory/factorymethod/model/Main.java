package com.ly.pattern.creation.factory.factorymethod.model;

/**
 * 工厂方法模式(Factory Method)
 * 使用场景：消除简单工厂if else if的问题，符合开闭原则，且职责单一
 * JAVA中的场景：
 * java.lang.Object#toString() (在其子类中可以覆盖该方法)
 * java.lang.Class#newInstance()
 * java.lang.Integer#valueOf(String) (Boolean, Byte, Character,Short, Long, Float 和 Double与之类似)
 * java.lang.Class#forName()
 * java.lang.reflect.Array#newInstance()
 * java.lang.reflect.Constructor#newInstance()
 * 开源实现场景：
 * spring ioc中的org.springframework.beans.factory.support.DefaultListableBeanFactory#getBean(java.lang.Class)
 * slf4j中的LogFactory.getLogger(Class)，为类创建日志操作对象
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactoryA();
        factory.createProduct().handle();

//        AbstractFactory factory = new ConcreteFactoryB();
//        factory.createProduct().method();
    }
}