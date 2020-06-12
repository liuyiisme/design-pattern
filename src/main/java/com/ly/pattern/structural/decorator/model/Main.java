package com.ly.pattern.structural.decorator.model;

/**
 * 装饰模式(Decorator)
 * 使用场景：静态代理，方法增强
 * JAVA中的场景：
 * java.lang.Integer#Integer(int)
 * java.io.BufferedInputStream(InputStream)
 * java.io.DataInputStream(InputStream)
 * java.io.BufferedOutputStream(OutputStream)
 * java.util.zip.ZipOutputStream(OutputStream)
 * java.util.Collections#checked[List|Map|Set|SortedSet|SortedMap]()
 * 开源实现场景：
 *
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(subject);
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorB.handle();
        decoratorB.handle2();
    }
}
