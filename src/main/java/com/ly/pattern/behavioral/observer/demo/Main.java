package com.ly.pattern.behavioral.observer.demo;

/**
 * 需求：实现商品促销通知消费者，1使用JDK自带的观察者实现
 */
public class Main {
    public static void main(String[] args) {
        Goods goods = new Goods();
        goods.addObserver(new Person("张三"));
        goods.addObserver(new Person("李四"));
        goods.updatePrice();
    }
}
