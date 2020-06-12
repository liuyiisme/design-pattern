package com.ly.pattern.behavioral.memento.model;

/**
 * 发起者类
 */
public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento mememto) {
        this.setState(mememto.getState());
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
