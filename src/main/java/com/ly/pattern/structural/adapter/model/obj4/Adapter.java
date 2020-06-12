package com.ly.pattern.structural.adapter.model.obj4;

/**
 * 适配器类
 */
public class Adapter implements Target {
    // 内置一个适配者对象
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handle() {
        adaptee.handle();
        System.out.println("Adapter handle bussiness");
    }
}
