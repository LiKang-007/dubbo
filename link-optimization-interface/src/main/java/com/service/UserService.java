package com.service;

import com.entity.User;

/**
 * @Auther:LiKang
 * @Date:2021/7/26 -07 -26 -11:47
 * @Description: com.service
 * @version: 1.0
 */
public interface UserService {
    //通过id查询User
     User queryUser(Integer id);
    //返回一个自定义User对象
     User  getUser();
}
