package com.ly.pattern.behavioral.interpreter.demo;

/**
 * 加法解析类
 */
public class Plus extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interperter(Context context) {
        return left.interperter(context) + right.interperter(context);
    }
}
