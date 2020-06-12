package com.ly.pattern.behavioral.command.model;

/**
 * 命令调用者实现类
 */
public class Invoker {
    // 内置一个命令对象
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void request(){
        System.out.println("Invoker request handle");
        command.execute();
    }
}
