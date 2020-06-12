package com.ly.pattern.behavioral.interpreter.model;

/**
 * 环境类
 */
public class Context {
    private AbstractExpression expression;
    public void handle(){
        expression.interperter(this);
    }
}
