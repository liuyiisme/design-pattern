package com.ly.pattern.behavioral.iterator.model;

/**
 * 迭代器模式(Iterator)
 * 使用场景：提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示
 * JAVA中的场景：
 * java.util.Iterator
 * java.util.Enumeration
 * 开源实现场景：
 */
public class Main {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("aaa");
        aggregate.add("bbb");
        aggregate.add("ccc");
        Iterator iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
