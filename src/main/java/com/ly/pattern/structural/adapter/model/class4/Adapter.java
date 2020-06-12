package com.ly.pattern.structural.adapter.model.class4;

/**
 * 适配器类：继承适配者类，实现抽象目标接口
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void handle() {
        super.handle();
        System.out.println("Adapter handle bussiness");
    }
}
