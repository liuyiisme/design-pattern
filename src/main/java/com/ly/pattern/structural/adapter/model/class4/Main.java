package com.ly.pattern.structural.adapter.model.class4;

/**
 * 适配器模式(Adapter)：类结构适配器
 * 使用场景：当前接口不适应新需求，需要重新改造，使用继承改造
 * JAVA中的场景：
 * 开源实现场景：
 */
public class Main {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.handle();
    }
}
