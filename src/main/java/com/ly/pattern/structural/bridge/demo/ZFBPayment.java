package com.ly.pattern.structural.bridge.demo;

/**
 * 支付宝实现支付
 */
public class ZFBPayment implements IPayment {
    @Override
    public void payment() {
        System.out.println("使用支付宝来支付");
    }
}
