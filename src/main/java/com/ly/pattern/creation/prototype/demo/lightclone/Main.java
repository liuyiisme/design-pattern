package com.ly.pattern.creation.prototype.demo.lightclone;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 需求：生成一百万条用户对象的测试数据，并保存到数据库中
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        for (int i = 0; i < 10000; i++) {
            List<User> list = new ArrayList<>();
            for (int j = 0; j < 100; j++) {
                User clone = user.clone();
                clone.setUsername(UUID.randomUUID().toString());
                list.add(clone);
                batchSave(list);
            }
        }
    }

    public static void batchSave(List<User> list){
        System.out.println("操作数据库，批量保存");
    }
}
