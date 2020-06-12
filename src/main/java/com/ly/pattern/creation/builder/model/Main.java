package com.ly.pattern.creation.builder.model;

/**
 * 建造者模式(Builder)
 * 使用场景：将大对象分割成多子对象，部分-整体
 * JAVA中的场景：
 * java.lang.StringBuilder#append()
 * java.lang.StringBuffer#append()
 * java.nio.ByteBuffer#put() (CharBuffer, ShortBuffer, IntBuffer,LongBuffer, FloatBuffer 和DoubleBuffer与之类似)
 * javax.swing.GroupLayout.Group#addComponent()java.sql.PreparedStatement
 * java.lang.Appendable的所有实现类
 * 开源实现场景：
 * mongodb中的聚合查询 org.springframework.data.mongodb.core.aggregation.Aggregation#newAggregation(org.springframework.data.mongodb.core.aggregation.AggregationOperation...)
 * 雪花算法：组成部分：41位时间戳+10位（数据中心5位+机器码5位）+12位序列号
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());
        Product product = director.getResult();
        System.out.println(product.getPartA());
    }
}