package com.ly.pattern.behavioral.chainofresponsibility.demo;

/**
 * 责任链模式：分而治之
 * 示例：CI/CD自动部署流程。检查git分支代码有更新-下载git代码-打包-上传服务器-部署-启动-检查服务是否可用-（重试/回滚）
 */
public class Main {
    public static void main(String[] args) {
        Handler gitCheckHandler = new GitCheckHandler();
        Handler downloadHandler = new GitDownloadHandler();
        Handler packageHandler = new PackageHandler();
        Handler uploadFileHandler = new UploadFileHandler();
        Handler installHandler = new InstallHandler();
        Handler startServiceHandler = new StartServiceHandler();
        Handler checkServiceHandler = new CheckServiceHandler();

        gitCheckHandler.setNext(downloadHandler);
        downloadHandler.setNext(packageHandler);
        packageHandler.setNext(uploadFileHandler);
        uploadFileHandler.setNext(installHandler);
        installHandler.setNext(startServiceHandler);
        startServiceHandler.setNext(checkServiceHandler);

        gitCheckHandler.handle();

    }
}
