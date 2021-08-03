package com.entity;

import java.io.Serializable;

/**
 * @Auther:LiKang
 * @Date:2021/7/26 -07 -26 -11:46
 * @Description: com.entity
 * @version: 1.0
 */
public class User implements Serializable {
    Integer id;
    String userName;

    public User() {
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

    public User(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }
}
