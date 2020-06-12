package com.ly.pattern.behavioral.interpreter.demo;

import com.ly.pattern.structural.decorator.model.ConcreteDecoratorB;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境类
 */
public class Context {
    private Map<Variable, Integer> ctx = new HashMap<>();

    public void assign(Variable name, Integer value) {
        ctx.put(name, value);
    }

    public Integer lookup(Variable name) {
        return ctx.get(name);
    }

}
