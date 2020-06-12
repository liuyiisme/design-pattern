package com.ly.pattern.behavioral.iterator.model;

import java.util.List;

/**
 * 迭代器实现类
 */
public class ConcreteIterator implements Iterator {
    private int course;

    private List list;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public Object first() {
        course = 0;
        return list.get(0);
    }

    @Override
    public Object next() {
        return list.get(course++);
    }

    @Override
    public boolean hasNext() {
        if (course < list.size() - 1) {
            return true;
        }
        return false;
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }
}
