package com.ly.pattern.behavioral.mediator.demo;

/**
 * 需求：民航飞机向信号塔请求飞行高度
 */
public class Main {
    public static void main(String[] args) {
        SignalTower signalTower = new ConcreteSignalTower();
        Airplane airplaneA = new ConcreteAirplane(signalTower, "A");
        Airplane airplaneB = new ConcreteAirplane(signalTower, "B");
        airplaneA.send();
    }
}
