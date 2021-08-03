package com.web;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


/**
 * @Auther:LiKang
 * @Date:2021/7/23 -07 -23 -16:50
 * @Description: com.web
 * @version: 1.0
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;


   @RequestMapping(value="/user")
    public String  getUserService(Model model,Integer id){
        User user= userService.queryUser(id);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
