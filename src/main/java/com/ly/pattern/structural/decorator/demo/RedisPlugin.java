package com.ly.pattern.structural.decorator.demo;

/**
 * 具体装饰者：Redis插件
 */
public class RedisPlugin extends AbstractPluginDecorator {
    public RedisPlugin(Plugin plugin) {
        super(plugin);
    }

    @Override
    public void handle() {
        plugin.handle();
        function();
    }

    public void function(){
        System.out.println("连接redis，查看redis数据");
    }
}
