package com.ly.pattern.behavioral.observer.model;

/**
 * 抽象主题接口
 */
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
