package com.ly.pattern.creation.factory.factorymethod.demo;

/**
 * 需求：调用淘宝、京东的商品接口获取数据，改造成工厂方法模式
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new JdFactory();
        factory.createProductDataProcess().getProductList();

//        AbstractFactory factory = new TaobaoFactory();
//        factory.createProductDataProcess().getProductList();

    }
}
