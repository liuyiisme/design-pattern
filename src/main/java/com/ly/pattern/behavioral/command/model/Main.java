package com.ly.pattern.behavioral.command.model;

/**
 * 命令模式(Command)
 * 使用场景：
 * 接口回调场景，接口方法就是命令，接口的实现就是接收者
 * A-B-C通讯模型
 * JAVA中的场景：
 * java.lang.Runnable
 * javax.swing.Action
 * 开源实现场景：
 * org.springframework.jdbc.core.JdbcTemplate#query(String, Object[], RowMapper)
 * Ctroller-Service-Dao
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.request();
    }
}
