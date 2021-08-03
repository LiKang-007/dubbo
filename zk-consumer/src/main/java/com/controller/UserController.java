package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:LiKang
 * @Date:2021/7/27 -07 -27 -15:22
 * @Description: com.controller
 * @version: 1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user")
    public String userDetail(Model model,Integer id){
        User user=userService.queryUser(id);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
