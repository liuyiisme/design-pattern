package com.ly.pattern.behavioral.mediator.model;

/**
 * 同事实现类A
 */
public class ConcreteCollagueA extends Colleague {
    public ConcreteCollagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive() {
        System.out.println("ConcreteCollagueA receive");
    }

    @Override
    public void send() {
        System.out.println("ConcreteCollagueA send");
        // 通过中介转发请求
        mediator.reply(this);
    }
}
