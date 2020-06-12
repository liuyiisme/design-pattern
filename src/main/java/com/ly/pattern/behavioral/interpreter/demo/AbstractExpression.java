package com.ly.pattern.behavioral.interpreter.demo;

/**
 * 抽象语法类
 */
public abstract class AbstractExpression {
    // 抽象解析接口
    public abstract int interperter(Context context);
}
