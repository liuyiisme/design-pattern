package com.ly.pattern.behavioral.visitor.model;

/**
 * 元素接口实现类A
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return ConcreteElementA.class.getName();
    }
}
