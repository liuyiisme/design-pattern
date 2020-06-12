package com.ly.pattern.creation.abstractfactory.demo;

public abstract class AbstractFactory {

    public static AbstractFactory createFactory(Class<? extends AbstractFactory> factory) {
        try {
            return factory.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public abstract IProductDataProcess createProductDataProcess();

    public abstract IProductDataProcessFast createProductDataProcessFast();

    public abstract IShopDataProcess createShopDataProcess();

}
