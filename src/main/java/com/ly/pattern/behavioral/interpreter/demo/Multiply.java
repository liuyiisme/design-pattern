package com.ly.pattern.behavioral.interpreter.demo;

/**
 * 乘法解析类
 */
public class Multiply extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public Multiply(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interperter(Context context) {
        return left.interperter(context) * right.interperter(context);
    }
}
