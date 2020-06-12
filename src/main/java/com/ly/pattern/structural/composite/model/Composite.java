package com.ly.pattern.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件实现类
 */
public class Composite implements Component {
    // 内置一个构件集合
    private List<Component> components = new ArrayList<>();

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void getChild(int i) {
        components.get(i);
    }

    @Override
    public void handle() {
        for (Component component : components) {
            component.handle();
        }
    }
}
