package com.ly.pattern.behavioral.mediator.demo;

public abstract class Airplane {
    protected String name;

    protected SignalTower signalTower;

    public Airplane(SignalTower signalTower, String name) {
        this.signalTower = signalTower;
        this.name = name;
        this.signalTower.register(this);
    }

    public abstract void send();

    public abstract void receive();
}
