package com.ly.pattern.behavioral.command.demo;

/**
 * 需求：设计一套命令接口（启动、关闭、重启服务），提供给界面使用，
 * 界面上有docker、tomcat、nginx、mysql、mongodb等等
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new TomcatReceiver();
        Command command = new CommandImpl(receiver);
        Invoker invoker = new Invoker(command);
        invoker.request("start");
    }
}
