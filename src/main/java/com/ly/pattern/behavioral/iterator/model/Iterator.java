package com.ly.pattern.behavioral.iterator.model;

/**
 * 抽象迭代器接口
 */
public interface Iterator {
    Object first();

    Object next();

    boolean hasNext();

    void remove(Object obj);
}
