package com.service.impl;

import com.entity.User;
import com.service.UserService;

/**
 * @Auther:LiKang
 * @Date:2021/7/26 -07 -26 -12:27
 * @Description: impl
 * @version: 1.0
 */
public class UserServiceImpl implements UserService {
    @Override
    public User queryUser(Integer id) {
       return new User(id,id+"号小肥侠");
    }

    @Override
    public User getUser() {
        return new User(101,"超级至尊肥");
    }
}
