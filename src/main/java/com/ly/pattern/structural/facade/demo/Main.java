package com.ly.pattern.structural.facade.demo;

/**
 * 外观模式：提供一个公共门面对象，内部处理多个子系统的调用。
 * JAVA中MVC三层结构就是门面模式
 */
public class Main {
    public static void main(String[] args) {
        WindowFacade facade = new WindowFacade();
        facade.handleBirthCertificate();
        facade.handleMedicalInsurance();
        facade.handleResidenceBookle();
    }
}
