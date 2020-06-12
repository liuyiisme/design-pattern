package com.ly.pattern.behavioral.memento.model;

/**
 * 备忘录模式(Memento)
 * 使用场景：生成快照，撤销、恢复操作等
 * JAVA中的场景：
 * java.util.Date
 * java.io.Serializable
 * 开源实现场景：
 */
public class Main {
    public static void main(String[] args) {
        Originator or = new Originator();
        Caretaker cr = new Caretaker();
        or.setState("S0");
        System.out.println("初始状态:" + or.getState());
        cr.setMemento(or.createMemento()); //保存状态
        or.setState("S1");
        System.out.println("新的状态:" + or.getState());
        or.restoreMemento(cr.getMemento()); //恢复状态
        System.out.println("恢复状态:" + or.getState());
    }
}