package com.ly.pattern.creation.prototype.demo.deepclone;

import java.io.Serializable;

/**
 * 实现java.io.Serializable接口，实现深拷贝
 */
public class User implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;

    private String username;

    private Role role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
