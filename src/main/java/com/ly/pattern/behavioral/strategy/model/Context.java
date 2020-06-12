package com.ly.pattern.behavioral.strategy.model;

/**
 * 环境类
 */
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void handle() {
        strategy.handle();
    }
}
