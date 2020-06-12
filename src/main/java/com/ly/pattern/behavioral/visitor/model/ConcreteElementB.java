package com.ly.pattern.behavioral.visitor.model;

/**
 * 元素接口实现类B
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return ConcreteElementB.class.getName();
    }
}
