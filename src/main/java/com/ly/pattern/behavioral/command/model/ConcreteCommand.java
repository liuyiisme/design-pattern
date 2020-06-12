package com.ly.pattern.behavioral.command.model;

/**
 * 命令接口实现类
 */
public class ConcreteCommand implements Command {
    // 内置一个命令接收对象
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.handle();
    }
}
