package com.ly.pattern.creation.abstractfactory.demo;

public class JdShopDataProcessImpl implements IShopDataProcess {
    @Override
    public void getShopList() {
        System.out.println("调用京东商铺接口，获取商铺列表数据");
    }
}
