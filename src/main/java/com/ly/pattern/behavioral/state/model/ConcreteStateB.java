package com.ly.pattern.behavioral.state.model;

/**
 * 状态实现类B
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("ConcreteStateB handle bussiness");
    }
}
