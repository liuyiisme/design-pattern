package com.ly.pattern.creation.factory.simplefactory.demo;

public class TaobaoProductDataProcessImpl implements IProductDataProcess {
    @Override
    public void getProductList() {
        System.out.println("调用淘宝商品接口，获取淘宝商品列表数据");
    }
}
