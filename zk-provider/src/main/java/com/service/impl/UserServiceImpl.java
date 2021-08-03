package com.service.impl;

import com.entity.User;
import com.service.UserService;

/**
 * @Auther:LiKang
 * @Date:2021/7/27 -07 -27 -13:16
 * @Description: com.impl
 * @version: 1.0
 */
public class UserServiceImpl implements UserService {
    @Override
    public User queryUser(Integer id) {

        return new User(id,"使用注册中心");
    }
}
