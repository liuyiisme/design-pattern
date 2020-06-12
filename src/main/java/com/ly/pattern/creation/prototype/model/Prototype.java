package com.ly.pattern.creation.prototype.model;

public class Prototype implements Cloneable {
    public Prototype() {
        System.out.println("我被初始化了");
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
