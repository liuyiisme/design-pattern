package com.ly.pattern.creation.prototype.demo.deepclone;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 需求：生成一百万条用户对象的测试数据，并保存到数据库中，每个用户有一个guest角色
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        for (int i = 0; i < 10000; i++) {
            List<User> list = new ArrayList<>();
            for (int j = 0; j < 100; j++) {
                User clone = DeepCloneUtils.deepClone(user);
                clone.setUsername(UUID.randomUUID().toString());
                clone.setRole(new Role("guest"));
                batchSave(list);
            }
        }
    }

    public static void batchSave(List<User> list) {
        System.out.println("操作数据库，批量保存");
    }
}
