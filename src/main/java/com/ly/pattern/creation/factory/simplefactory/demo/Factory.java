package com.ly.pattern.creation.factory.simplefactory.demo;

public class Factory {
    public static IProductDataProcess createProductDataProcess(String type) {
        if (type.equals("taobao")) {
            return new TaobaoProductDataProcessImpl();
        } else if (type.equals("jd")) {
            return new JdProductDataProcessImpl();
        }
        return null;
    }
}
