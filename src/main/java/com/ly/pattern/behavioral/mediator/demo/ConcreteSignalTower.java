package com.ly.pattern.behavioral.mediator.demo;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSignalTower implements SignalTower {
    private List<Airplane> airplaneList = new ArrayList<>();

    @Override
    public void register(Airplane airplane) {
        airplaneList.add(airplane);
    }

    @Override
    public void reply(Airplane airplane) {
        for (Airplane a : airplaneList) {
            if (a != airplane) {
                a.receive();
            }
        }
    }
}
