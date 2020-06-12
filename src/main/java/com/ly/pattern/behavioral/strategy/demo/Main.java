package com.ly.pattern.behavioral.strategy.demo;

/**
 * 需求：实现计数器加减乘除基本功能
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new AddStratege());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new SubtractStratege());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new MultiplyStratege());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        context = new Context(new DevideStratege());
        System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
    }
}
