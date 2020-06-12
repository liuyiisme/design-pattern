package com.ly.pattern.behavioral.templatemethod.demo;

/**
 * 需求：实现一个部署流程。
 * 检查git是否有更新-git下载-maven打包-docker打包-docker发布-检查服务
 */
public class Main {
    public static void main(String[] args) {
        AbstractDeploy deploy = new GitFileDeploy();
        deploy.start();
    }
}
