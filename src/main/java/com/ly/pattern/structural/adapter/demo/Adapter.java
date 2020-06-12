package com.ly.pattern.structural.adapter.demo;

/**
 * 适配器类：内置一个老接口对象，实现新接口
 */
public class Adapter implements TaobaoShopDataProcess_V2 {
    private TaobaoShopDataProcess_V1 adaptee;

    public Adapter(TaobaoShopDataProcess_V1 adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void getShopData() {
        System.out.println("调用淘宝商品V2接口，获取数据");
    }
}
