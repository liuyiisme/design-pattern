package com.ly.pattern.structural.decorator.demo;

/**
 * 具体装饰者：Mybatis插件
 */
public class MybatisPlugin extends AbstractPluginDecorator {
    public MybatisPlugin(Plugin plugin) {
        super(plugin);
    }

    @Override
    public void handle() {
        plugin.handle();
        function();
    }

    public void function() {
        System.out.println("mybatis方法与mybatis xml配置文件可以联动切换了");
    }
}
