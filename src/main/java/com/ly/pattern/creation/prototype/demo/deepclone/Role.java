package com.ly.pattern.creation.prototype.demo.deepclone;

import java.io.Serializable;

public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    private String roleName;

    public Role(String roleName) {
        this.roleName = roleName;
    }
}
