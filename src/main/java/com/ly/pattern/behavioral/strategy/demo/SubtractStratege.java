package com.ly.pattern.behavioral.strategy.demo;

public class SubtractStratege implements Strategy {
    @Override
    public int calc(int num1, int num2) {
        return num1 - num2;
    }
}
