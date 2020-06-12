package com.ly.pattern.structural.adapter.demo;

/**
 * 需求：淘宝商品数据接口升级了，需要同步升级改造调用最新的商品数据接口
 */
public class Main {
    public static void main(String[] args) {
        TaobaoShopDataProcess_V2 target = new Adapter(new TaobaoShopDataProcess_V1());
        target.getShopData();
    }
}
