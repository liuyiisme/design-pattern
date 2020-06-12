package com.ly.pattern.creation.factory.factorymethod.demo;

public class JdFactory extends AbstractFactory {
    @Override
    public IProductDataProcess createProductDataProcess() {
        return new JdProductDataProcessImpl();
    }
}
