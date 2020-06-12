package com.ly.pattern.behavioral.mediator.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介者实现类
 */
public class ConcreteMediator implements Mediator {
    // 中介场所
    private List<Colleague> list = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        list.add(colleague);
    }

    @Override
    public void reply(Colleague colleague) {
        for (Colleague c : list) {
            if (c != colleague) {
                c.receive();
            }
        }
    }
}
