package com.ly.pattern.behavioral.mediator.demo;

public interface SignalTower {
    void register(Airplane airplane);

    void reply(Airplane airplane);
}
