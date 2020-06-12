package com.ly.pattern.behavioral.iterator.model;

/**
 * 抽象聚合接口
 */
public interface Aggregate {
    void add(Object obj);

    void remove(Object obj);

    // 返回一个迭代器
    Iterator getIterator();
}
