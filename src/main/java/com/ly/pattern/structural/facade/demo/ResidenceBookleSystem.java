package com.ly.pattern.structural.facade.demo;

/**
 * 户口本系统
 */
public class ResidenceBookleSystem implements HandleCertificate {
    @Override
    public void handle() {
        System.out.println("办理上户口");
    }
}
