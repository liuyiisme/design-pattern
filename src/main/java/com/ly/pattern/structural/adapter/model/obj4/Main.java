package com.ly.pattern.structural.adapter.model.obj4;

/**
 * 适配器模式(Adapter)：对象适配器
 * 从而衍生出了，代理模式-装饰者模式-外观模式，桥接模式-组合模式-享元模式
 * JAVA中的场景：
 * 开源实现场景：
 */
public class Main {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.handle();
    }
}
