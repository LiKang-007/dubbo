package com.service;

import com.entity.User;

/**
 * @Auther:LiKang
 * @Date:2021/7/27 -07 -27 -13:08
 * @Description: com.service
 * @version: 1.0
 */
public interface UserService {
    //通过id查询user
    User queryUser(Integer id);
}
