package com.ly.pattern.structural.composite.model;

/**
 * 抽象构件接口
 */
public interface Component {
    void add(Component component);

    void remove(Component component);

    void getChild(int i);

    void handle();
}
