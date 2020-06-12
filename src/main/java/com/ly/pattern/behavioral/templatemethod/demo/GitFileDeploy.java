package com.ly.pattern.behavioral.templatemethod.demo;

/**
 * 模板子类
 */
public class GitFileDeploy extends AbstractDeploy {
    @Override
    protected void downloadUpdate() {
        System.out.println("实现git文件下载");
    }

    @Override
    protected void checkUpdate() {
        System.out.println("实现git文件检查是否有更新");
    }
}
