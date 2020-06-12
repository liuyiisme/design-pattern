package com.ly.pattern.behavioral.command.demo;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void request(String cmd){
        command.execute(cmd);
    }
}
