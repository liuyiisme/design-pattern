package com.ly.pattern.behavioral.observer.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题接口实现类
 */
public class ConcreteSubject implements Subject {
    private List<Observer> list = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update();
        }
    }
}
