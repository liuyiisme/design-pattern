package com.ly.pattern.behavioral.observer.demo;

import java.util.Observable;

/**
 * 角色：Subject
 */
public class Goods extends Observable {
    public void updatePrice(){
        setChanged();
        System.out.println("商城发出短息：商城商品促销啦");
        notifyObservers("商城商品促销啦");
    }
}
