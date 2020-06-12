package com.ly.pattern.structural.decorator.demo;

public class Idea implements Plugin {
    @Override
    public void handle(){
        System.out.println("创建Maven项目，编写代码");
    }
}
