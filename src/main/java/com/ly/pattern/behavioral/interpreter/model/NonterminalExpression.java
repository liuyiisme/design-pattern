package com.ly.pattern.behavioral.interpreter.model;

/**
 * 非终结语法解析实现类
 */
public class NonterminalExpression extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    @Override
    public void interperter(Context context) {

    }
}
