package com.ly.pattern.creation.abstractfactory.demo;

public class JdProductDataProcessImpl implements IProductDataProcess {
    @Override
    public void getProductList() {
        System.out.println("调用京东商品接口，获取商品列表数据");
    }
}
