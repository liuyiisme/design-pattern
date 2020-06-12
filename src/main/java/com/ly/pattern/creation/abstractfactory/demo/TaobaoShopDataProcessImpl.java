package com.ly.pattern.creation.abstractfactory.demo;

public class TaobaoShopDataProcessImpl implements IShopDataProcess {
    @Override
    public void getShopList() {
        System.out.println("调用淘宝商铺接口，获取商铺列表数据");
    }
}
