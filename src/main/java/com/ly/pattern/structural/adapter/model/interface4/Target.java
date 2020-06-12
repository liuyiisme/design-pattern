package com.ly.pattern.structural.adapter.model.interface4;

/**
 * 目标实现类
 */
public class Target extends AbstractAdapter {
    @Override
    public void handle1() {
        System.out.println("Target handle bussiness");
    }
}
