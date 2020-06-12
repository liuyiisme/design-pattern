package com.ly.pattern.structural.facade.model;

/**
 * 外观类
 */
public class Facade {
    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    public Facade(){
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
    }

    public void handleA(){
        subSystemA.handle();
    }

    public void handleB(){
        subSystemB.handle();
    }
}
