package com.ly.pattern.behavioral.mediator.demo;

public class ConcreteAirplane extends Airplane {
    public ConcreteAirplane(SignalTower signalTower, String name) {
        super(signalTower, name);
    }

    @Override
    public void send() {
        System.out.println(name + "申请降低高度");
        signalTower.reply(this);
    }

    @Override
    public void receive() {
        System.out.println(name + "收到降低高度消息，进行调整");
    }
}
