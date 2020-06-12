package com.ly.pattern.structural.bridge.demo;

/**
 * 支付抽象层子类
 */
public class RefindPayment extends AbstractPayment {
    @Override
    public void payment() {
        paymentProduct.payment();
    }
}
