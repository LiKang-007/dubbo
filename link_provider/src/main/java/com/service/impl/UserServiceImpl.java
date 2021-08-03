package com.service.impl;

import com.entity.User;
import com.service.UserService;

/**
 * @Auther:LiKang
 * @Date:2021/7/22 -07 -22 -13:56
 * @Description: com.service.impl
 * @version: 1.0
 */
public class UserServiceImpl implements UserService {
    @Override
    public User queryUser(Integer id) {
        User user =new User(id,"李康");
        return user;
    }
}
