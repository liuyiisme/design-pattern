package com.ly.pattern.behavioral.command.demo;

public class CommandImpl implements Command {
    private Receiver receiver;

    public CommandImpl(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String cmd) {
        if ("start".equals(cmd)) {
            receiver.start();
        } else if ("stop".equals(cmd)) {
            receiver.stop();
        } else if ("restart".equals(cmd)) {
            receiver.restart();
        }
    }
}
