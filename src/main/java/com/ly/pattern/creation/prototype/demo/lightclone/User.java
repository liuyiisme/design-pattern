package com.ly.pattern.creation.prototype.demo.lightclone;

/**
 * 实现java.lang.Cloneable接口，浅拷贝
 */
public class User implements Cloneable {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    protected User clone(){
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
