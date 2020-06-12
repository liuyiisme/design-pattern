package com.ly.pattern.behavioral.visitor.model;

/**
 * 访问者实现类B
 */
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(Element element) {
        System.out.println("visit element name : " + element.getValue());
    }
}
