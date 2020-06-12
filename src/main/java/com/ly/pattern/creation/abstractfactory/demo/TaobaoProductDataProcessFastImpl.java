package com.ly.pattern.creation.abstractfactory.demo;

public class TaobaoProductDataProcessFastImpl implements IProductDataProcessFast {
    @Override
    public void getProductListFast() {
        System.out.println("调用淘宝商品高性能接口，获取商品列表数据");
    }
}
