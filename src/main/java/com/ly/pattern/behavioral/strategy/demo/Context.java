package com.ly.pattern.behavioral.strategy.demo;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.calc(num1, num2);
    }
}
