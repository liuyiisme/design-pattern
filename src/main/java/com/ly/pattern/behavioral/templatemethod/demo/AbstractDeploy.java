package com.ly.pattern.behavioral.templatemethod.demo;

/**
 * 抽象模板类
 */
public abstract class AbstractDeploy {
    public void start() {
        // 检查文件是否有更新
        checkUpdate();
        // 下载更新
        downloadUpdate();
        // maven打包
        mavenPackage();
        // docker打包
        dockerPackage();
        // 部署
        deploy();
        // 启动服务
        startService();
        // 检查服务是否可用
        checkService();
    }

    private void checkService() {
        System.out.println("实现检查服务是否可用");
    }

    private void startService() {
        System.out.println("实现启动服务");
    }

    private void deploy() {
        System.out.println("实现部署");
    }

    private void dockerPackage() {
        System.out.println("实现docker打包");
    }

    private void mavenPackage() {
        System.out.println("实现maven打包");
    }

    protected abstract void downloadUpdate();

    protected abstract void checkUpdate();


}
