package controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:LiKang
 * @Date:2021/7/28 -07 -28 -14:09
 * @Description: controller
 * @version: 1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserService userService2;
    @RequestMapping("user")
    public String userDetail(Model model,Integer id){
        User user=userService.queryUser(id);
        User user2=userService2.queryUser(id);
        model.addAttribute("user",user);
        model.addAttribute("user2",user2);
        return "userDetail";
    }
}
