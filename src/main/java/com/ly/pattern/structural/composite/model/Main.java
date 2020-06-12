package com.ly.pattern.structural.composite.model;

/**
 * 组合模式(Composite)
 * 使用场景：部分-整体，有层次结构。比如目录树
 * JAVA中的场景：
 * javax.swing.JComponent#add(Component)
 * java.awt.Container#add(Component)
 * java.util.Map#putAll(Map)
 * java.util.List#addAll(Collection)
 * java.util.Set#addAll(Collection)
 * 开源实现场景：
 * springboot中的注解组合
 */
public class Main {
    public static void main(String[] args) {
        Component c0 = new Composite();
        Component c1 = new Composite();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.handle();
    }
}
