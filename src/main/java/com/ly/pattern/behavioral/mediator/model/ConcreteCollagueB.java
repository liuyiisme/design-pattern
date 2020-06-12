package com.ly.pattern.behavioral.mediator.model;

/**
 * 同事实现类B
 */
public class ConcreteCollagueB extends Colleague {
    public ConcreteCollagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive() {
        System.out.println("ConcreteCollagueB receive");
    }

    @Override
    public void send() {
        System.out.println("ConcreteCollagueB send");
        // 通过中介转发请求
        mediator.reply(this);
    }
}
