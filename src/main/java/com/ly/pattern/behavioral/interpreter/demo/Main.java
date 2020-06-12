package com.ly.pattern.behavioral.interpreter.demo;

/**
 * 需求：模拟计算器加减乘除
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        // 变量
        Variable x = new Variable();
        Variable y = new Variable();
        // 赋值
        context.assign(x, 2);
        context.assign(y, 3);

        // (x+y)-(x-y)
        AbstractExpression substract = new Substract(new Plus(x, y), new Substract(x, y));

        int result = substract.interperter(context);
        System.out.println("result = " + result);
    }
}
