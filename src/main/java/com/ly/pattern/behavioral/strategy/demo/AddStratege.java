package com.ly.pattern.behavioral.strategy.demo;

public class AddStratege implements Strategy {
    @Override
    public int calc(int num1, int num2) {
        return num1 + num2;
    }
}
