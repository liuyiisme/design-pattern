package com.ly.pattern.behavioral.state.model;

/**
 * 状态实现类A
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("ConcreteStateA handle bussiness");
        context.setState(new ConcreteStateB());
    }
}
