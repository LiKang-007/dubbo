package com.entity;

import java.io.Serializable;

/**
 * @Auther:LiKang
 * @Date:2021/7/27 -07 -27 -13:06
 * @Description: com.entity
 * @version: 1.0
 */
public class User implements Serializable {
    Integer id;
    String userName;

    public User() {
    }

    public User(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
