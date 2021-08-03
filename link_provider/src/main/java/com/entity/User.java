package com.entity;

import java.io.Serializable;

/**
 * @Auther:LiKang
 * @Date:2021/7/22 -07 -22 -13:53
 * @Description: com.entity
 * @version: 1.0
 */
public class User implements Serializable {
    Integer id;
    String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
