package com.control;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:LiKang
 * @Date:2021/7/26 -07 -26 -13:41
 * @Description: com.control
 * @version: 1.0
 */
@Controller
public class UserControl {
    @Autowired
    private UserService userService;
    @RequestMapping("/userDetail")
    public String userDetail(Model model,Integer id){
        //根据用户标识获取用户详情
        User user=userService.queryUser(id);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
