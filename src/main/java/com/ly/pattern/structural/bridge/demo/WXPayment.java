package com.ly.pattern.structural.bridge.demo;

/**
 * 微信支付产品
 */
public class WXPayment implements IPayment {
    @Override
    public void payment() {
        System.out.println("使用微信来支付");
    }
}
