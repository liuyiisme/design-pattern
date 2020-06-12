package com.ly.pattern.behavioral.observer.demo;

import java.util.Observable;
import java.util.Observer;

/**
 * 角色：Observer
 */
public class Person implements Observer {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "收到短信通知：" + arg + "。准备前往商场逛逛。");
    }
}
