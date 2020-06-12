package com.ly.pattern.behavioral.interpreter.model;

/**
 * 抽象语法类
 */
public abstract class AbstractExpression {
    // 抽象解析接口
    public abstract void interperter(Context context);
}
