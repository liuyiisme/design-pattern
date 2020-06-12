package com.ly.pattern.structural.facade.demo;

/**
 * 医保卡系统
 */
public class MedicalInsuranceSystem implements HandleCertificate {
    @Override
    public void handle() {
        System.out.println("办理医保保险");
    }
}
