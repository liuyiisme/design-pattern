package com.ly.pattern.structural.facade.demo;

/**
 *
 */
public class WindowFacade {
    private HandleCertificate bcs = new BirthCertificateSystem();
    private HandleCertificate mis = new MedicalInsuranceSystem();
    private HandleCertificate rbs = new ResidenceBookleSystem();

    public void handleBirthCertificate() {
        bcs.handle();
    }

    public void handleMedicalInsurance() {
        mis.handle();
    }

    public void handleResidenceBookle() {
        rbs.handle();
    }
}
