package com.ly.pattern.structural.decorator.demo;

/**
 * 装饰者模式也叫包装器模式，意图是不改变原对象的情况下，扩展新功能
 * Java中的包装类Integer,Long,Boolean，I/O流都是采取这种模式开发的
 * 示例：给Idea安装插件，使其功能更强大
 */
public class Main {
    public static void main(String[] args) {
        Plugin idea = new Idea();
        AbstractPluginDecorator mybatisPlugin = new MybatisPlugin(idea);
        AbstractPluginDecorator redisPlugin = new RedisPlugin(mybatisPlugin);
        redisPlugin.handle();
    }
}
