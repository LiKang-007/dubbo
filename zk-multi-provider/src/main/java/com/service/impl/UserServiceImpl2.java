package com.service.impl;

import com.entity.User;
import com.service.UserService;

/**
 * @Auther:LiKang
 * @Date:2021/7/28 -07 -28 -13:53
 * @Description: com.service.impl
 * @version: 1.0
 */
public class UserServiceImpl2 implements UserService {
    @Override
    public User queryUser(Integer id) {
        return new User(id,"提供的服务版本2");
    }
}
