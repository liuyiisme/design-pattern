package com.ly.pattern.behavioral.state.model;

/**
 * 抽象状态接口
 */
public interface State {
    void handle(Context context);
}
