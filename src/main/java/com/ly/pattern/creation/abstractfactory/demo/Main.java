package com.ly.pattern.creation.abstractfactory.demo;

/**
 * 需求：
 * 1、调用淘宝、京东的接口获取数据
 * 2、有商铺接口数据和商品接口数据
 * 3、需要兼容接口版本的升级变化，如：淘宝二代商品接口升级，提升了性能
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory.createFactory(JdFactory.class).createProductDataProcess().getProductList();
        AbstractFactory.createFactory(JdFactory.class).createShopDataProcess().getShopList();
        AbstractFactory.createFactory(TaobaoFactory.class).createProductDataProcess().getProductList();
        AbstractFactory.createFactory(TaobaoFactory.class).createShopDataProcess().getShopList();

        AbstractFactory.createFactory(TaobaoFactory.class).createProductDataProcessFast().getProductListFast();
    }
}
