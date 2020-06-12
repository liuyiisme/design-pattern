package com.ly.pattern.behavioral.interpreter.demo;

import com.ly.pattern.structural.decorator.model.ConcreteDecoratorB;

/**
 * 终结语法解析实现类（变量）
 */
public class Variable extends AbstractExpression {
    @Override
    public int interperter(Context context) {
        return context.lookup(this);
    }
}
