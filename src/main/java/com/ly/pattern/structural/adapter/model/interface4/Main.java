package com.ly.pattern.structural.adapter.model.interface4;

/**
 * 适配器模式(Adapter)：接口适配器
 * 使用场景：接口方法太多，用抽象类空实现，然后只需实现自身关注的接口即可
 * JAVA中的场景：
 * java.awt.event.WindowAdapter
 * 开源实现场景：
 */
public class Main {
    public static void main(String[] args) {
        Target target = new Target();
        target.handle1();
    }
}
