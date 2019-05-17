package com.xa.controller;

import com.xa.pojo.User;
import com.xa.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.mybatis.spring.SqlSessionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Resource
    UserService userService;
    @PostMapping("/userlogin")
    @ResponseBody
    public String userlogin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userService.selectByUserName(username);
        System.out.println("controller中的user对象为"+user);
        request.getSession().setAttribute("users",user);
        Subject subject = SecurityUtils.getSubject();
        System.out.println("走到了usercontroller");
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
       try {
           subject.login(token);
           System.out.println("进入");
           return "success";
       }catch(AuthenticationException e){
           e.printStackTrace();
           return "failure";
       }


    }
}