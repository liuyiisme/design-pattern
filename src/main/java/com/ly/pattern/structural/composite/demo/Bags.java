package com.ly.pattern.structural.composite.demo;

import java.util.ArrayList;

/**
 * 袋子
 */
public class Bags implements Articles {
    private ArrayList<Articles> bags = new ArrayList<Articles>();

    private String name; // 名字

    public Bags(String name) {
        this.name = name;
    }

    public void add(Articles c) {
        bags.add(c);
    }

    public void remove(Articles c) {
        bags.remove(c);
    }

    public Articles getChild(int i) {
        return bags.get(i);
    }

    public float calculation() {
        float s = 0;
        for (Articles articles : bags) {
            s += articles.calculation();
        }
        return s;
    }

    public void show() {
        for (Articles articles : bags) {
            articles.show();
        }
    }
}
