package scu.mtsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import scu.mtsp.domain.User;
import scu.mtsp.service.UserService;

import javax.servlet.http.HttpSession;

import static scu.mtsp.constant.MTSPConstant.USER_SESSION;

/**
 * Created by zhc on 2017/12/27
 */
@Controller
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping(value = "/login")
    public ModelAndView login(String loginname, String password, HttpSession session, ModelAndView mv) {
        User user = userService.login(loginname, loginname, password);
        if (user != null) {
            session.setAttribute(USER_SESSION, user);
            System.out.println("登陆成功");
            mv.setViewName("index");
        } else {
            System.out.println("登陆失败");
            mv.setViewName("login");
        }
        return mv;
    }

    @RequestMapping(value = "/user/register")
    public ModelAndView register(String flag, @ModelAttribute User user, ModelAndView mv) {
       if (flag == null){
           mv.setViewName("register");
       }else{
           userService.addUser(user);
           mv.setViewName("login");
       }
       return mv;
    }
}
