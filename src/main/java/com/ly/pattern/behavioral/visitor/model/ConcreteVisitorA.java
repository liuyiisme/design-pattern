package com.ly.pattern.behavioral.visitor.model;

/**
 * 访问者实现类A
 */
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(Element element) {
        System.out.println("visit element name : " + element.getValue());
    }
}
