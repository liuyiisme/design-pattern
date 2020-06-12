package com.ly.pattern.creation.abstractfactory.model;

/**
 * 抽象工厂类
 */
public abstract class AbstractFactory {
    // 创建子工厂
    public static AbstractFactory createFactory(Class<? extends AbstractFactory> factory) {
        try {
            return factory.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    // 创建抽象产品A，由子工厂实现
    public abstract ProductA createProductA();

    // 创建抽象产品B，由子工厂实现
    public abstract ProductB createProductB();
}
