package com.ly.pattern.structural.composite.model;

/**
 * 叶子构件实现类
 */
public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void getChild(int i) {

    }

    @Override
    public void handle() {
        System.out.println("Leaf" + name + " handle bussiness");
    }
}
