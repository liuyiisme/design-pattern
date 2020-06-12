package com.ly.pattern.structural.bridge.demo;

/**
 * 需求：设计一个支付接口，可以接入支付宝、微信、工商银行、中国银行等等
 */
public class Main {
    public static void main(String[] args) {
        AbstractPayment abstractPayment = new RefindPayment();
        IPayment payment = null;

        // 接入支付宝支付
        payment = new ZFBPayment();
        abstractPayment.setPaymentProduct(payment);
        abstractPayment.payment();

        // 接入微信支付
        payment = new WXPayment();
        abstractPayment.setPaymentProduct(payment);
        abstractPayment.payment();
    }
}
