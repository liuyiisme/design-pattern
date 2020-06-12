package com.ly.pattern.behavioral.mediator.model;

/**
 * 抽象中介者接口
 */
public interface Mediator {
    // 注册同事接口
    void register(Colleague colleague);

    // 回复同事接口
    void reply(Colleague colleague);
}
