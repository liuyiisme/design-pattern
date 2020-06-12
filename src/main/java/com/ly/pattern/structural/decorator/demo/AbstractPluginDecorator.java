package com.ly.pattern.structural.decorator.demo;

/**
 * 抽象装饰者：抽象插件，接收原插件
 */
public abstract class AbstractPluginDecorator implements Plugin {
    protected Plugin plugin;

    public AbstractPluginDecorator(Plugin plugin) {
        this.plugin = plugin;
    }

}
