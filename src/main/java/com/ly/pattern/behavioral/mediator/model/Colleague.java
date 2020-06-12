package com.ly.pattern.behavioral.mediator.model;

/**
 * 同事抽象类
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
        mediator.register(this);
    }

    public abstract void receive();

    public abstract void send();

}
