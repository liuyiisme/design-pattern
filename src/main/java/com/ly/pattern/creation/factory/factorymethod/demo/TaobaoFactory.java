package com.ly.pattern.creation.factory.factorymethod.demo;

public class TaobaoFactory extends AbstractFactory {
    @Override
    public IProductDataProcess createProductDataProcess() {
        return new TaobaoProductDataProcessImpl();
    }
}
