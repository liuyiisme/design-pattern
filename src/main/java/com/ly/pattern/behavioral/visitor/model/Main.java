package com.ly.pattern.behavioral.visitor.model;

/**
 * 访问者模式(Visitor)
 * 使用场景：解决稳定的数据结构和易变的操作耦合问题（类似方法回调）
 * JAVA中的场景：
 * javax.lang.model.element.AnnotationValue和AnnotationValueVisitor
 * javax.lang.model.element.Element和ElementVisitor
 * javax.lang.model.type.TypeMirror和TypeVisitor
 * 开源实现场景：
 */
public class Main {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();
        os.add(elementA);
        os.add(elementB);

        Visitor visitorA = new ConcreteVisitorA();
        os.accept(visitorA);
        Visitor visitorB = new ConcreteVisitorB();
        os.accept(visitorB);
    }
}