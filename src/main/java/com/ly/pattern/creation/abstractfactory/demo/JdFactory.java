package com.ly.pattern.creation.abstractfactory.demo;

public class JdFactory extends AbstractFactory {
    @Override
    public IProductDataProcess createProductDataProcess() {
        return new JdProductDataProcessImpl();
    }

    @Override
    public IShopDataProcess createShopDataProcess() {
        return new JdShopDataProcessImpl();
    }

    @Override
    public IProductDataProcessFast createProductDataProcessFast() {
        // 预留实现，等有需要的时候在实现
        return null;
    }
}
