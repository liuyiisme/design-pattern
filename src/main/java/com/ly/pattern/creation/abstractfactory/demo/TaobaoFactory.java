package com.ly.pattern.creation.abstractfactory.demo;

public class TaobaoFactory extends AbstractFactory {
    @Override
    public IProductDataProcess createProductDataProcess() {
        return new TaobaoProductDataProcessImpl();
    }

    @Override
    public IShopDataProcess createShopDataProcess() {
        return new TaobaoShopDataProcessImpl();
    }

    @Override
    public IProductDataProcessFast createProductDataProcessFast() {
        return new TaobaoProductDataProcessFastImpl();
    }
}
