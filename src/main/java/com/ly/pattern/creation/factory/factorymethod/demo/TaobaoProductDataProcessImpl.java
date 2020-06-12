package com.ly.pattern.creation.factory.factorymethod.demo;

public class TaobaoProductDataProcessImpl implements IProductDataProcess {
    @Override
    public void getProductList() {
        System.out.println("调用淘宝商品接口，获取商品列表数据");
    }
}
