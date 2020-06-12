package com.ly.pattern.structural.bridge.demo;

/**
 * 支付抽象层抽象类
 */
public abstract class AbstractPayment {
    protected IPayment paymentProduct;

    public void setPaymentProduct(IPayment paymentProduct) {
        this.paymentProduct = paymentProduct;
    }

    // 定义一个支付接口，由子类实现
    public abstract void payment();
}
