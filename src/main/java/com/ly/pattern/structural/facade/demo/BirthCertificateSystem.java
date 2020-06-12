package com.ly.pattern.structural.facade.demo;

/**
 * 出生证系统
 */
public class BirthCertificateSystem implements HandleCertificate {
    @Override
    public void handle() {
        System.out.println("办理出生证");
    }
}
