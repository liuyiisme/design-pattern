package com.ly.pattern.creation.prototype.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式(Prototype)
 * 使用场景：大量生成对象，性能加快。对象备份
 * JAVA中的场景：
 * java.lang.Object#clone() (支持浅克隆的类必须实现java.lang.Cloneable接口)
 * java.util.ArrayList#clone()
 * java.util.HashMap#clone()
 * java.util.HashSet#clone()
 * 开源实现场景：
 * spring中设置bean为prototype
 * struts2 action
 */
public class Main {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            Prototype clone = prototype.clone();
        }
        System.out.println("clone size = 10000,cost = " + (System.currentTimeMillis() - begin));

        begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            Prototype clone = new Prototype();
        }
        System.out.println("new size = 10000,cost = " + (System.currentTimeMillis() - begin));
    }
}
