package com.ly.pattern.creation.factory.simplefactory.demo;

/**
 * 需求：调用淘宝、京东的商品接口获取数据
 */
public class Main {
    public static void main(String[] args) {
        Factory.createProductDataProcess("jd").getProductList();
        Factory.createProductDataProcess("taobao").getProductList();
    }
}
