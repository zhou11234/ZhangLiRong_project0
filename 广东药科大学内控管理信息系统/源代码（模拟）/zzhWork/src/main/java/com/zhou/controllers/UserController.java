package com.zhou.controllers;

import com.zhou.pojo.AdminPojo;
import com.zhou.service.AdminServiceImpl;
import org.springframework.ui.Model;
import com.zhou.pojo.UserPojo;
import com.zhou.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    AdminServiceImpl adminService;

    @Autowired
    private AdminServiceImpl adminServiceImpl;

    @RequestMapping(value = "/index")
    public String index(){
//        System.out.println("1111111111111111111");
        return "index";
    }

    @GetMapping("/register")
    public String register() {
        return "/WEB-INF/jsp/register"; // 返回 register.jsp
    }

    @GetMapping("/login")
    public String login() {
        return "/WEB-INF/jsp/login";
    }

    //管理员登录

    @GetMapping("/adminLogin")
    public String adminLogin() {
        return "/WEB-INF/jsp/adminLogin";
    }

    @RequestMapping(value = "/findAdmin", method = RequestMethod.POST)
    public String findAdmin(@RequestParam("username") String username,
                           @RequestParam("password") String password,
                           Model model) {
        List<AdminPojo> admins = adminServiceImpl.findAdminByName(username); // 获取用户列表

        // 检查管理员列表是否不为空
        if (!admins.isEmpty()) {
            AdminPojo admin = admins.get(0); // 获取第一个管理员
            if (admin.getPassword().equals(password)) {
//                model.addAttribute("username", username);
                return "/WEB-INF/jsp/admin"; // 登录成功
            }
        }

        // 登录失败，返回登录页面并添加错误信息
//        model.addAttribute("error", "用户名或密码错误");
        return "/WEB-INF/jsp/adminLogin";
    }


    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(@RequestParam("username") String username,
                          @RequestParam("password") String password)   {
        userService.addUser(username,password);
        return "/WEB-INF/jsp/login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session, Model model) {
        List<UserPojo> users = userServiceImpl.findUserByName(username);

        if (!users.isEmpty()) {
            UserPojo user = users.get(0);
            if (user.getPassword().equals(password)) {
                // 将用户名存入 session 表示用户已登录
                session.setAttribute("username", username);
                model.addAttribute("username", username);
                return "/WEB-INF/jsp/welcome";
            }
        }
        return "/WEB-INF/jsp/login";
    }


}
