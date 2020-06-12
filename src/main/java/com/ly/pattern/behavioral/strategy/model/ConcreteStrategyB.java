package com.ly.pattern.behavioral.strategy.model;

/**
 * 策略接口实现类
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void handle() {
        System.out.println("ConcreteStrategyB handle bussiness");
    }
}
