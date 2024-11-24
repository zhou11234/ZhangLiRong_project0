package com.zhou.controllers;

import com.zhou.pojo.UserPojo;
import com.zhou.service.AdminServiceImpl;
import com.zhou.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class AdminController {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    AdminServiceImpl adminService;

    @Autowired
    private AdminServiceImpl adminServiceImpl;

    @GetMapping("/insertUser")
    public String insertUser(){
        return "/WEB-INF/jsp/insertUser";
    }

    @RequestMapping(value = "/findAllUser",method = RequestMethod.GET)
    public String findAllUser(Map<String, Object> model){
        List<UserPojo> userPojoList = adminServiceImpl.findAllUsers();
        model.put("userPojoList",userPojoList);
        return "/WEB-INF/jsp/allUser";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(){
        return "/WEB-INF/jsp/deleteUser";
    }

    @GetMapping("/updateUser")
    public String updateUser(){
        return "/WEB-INF/jsp/updateUser";
    }


    @RequestMapping(value = "/insertAnUser",method = RequestMethod.POST)
    public String addUser(@RequestParam("username") String username,
                          @RequestParam("password") String password)   {
        userService.addUser(username,password);
        return "/WEB-INF/jsp/admin";
    }

    @RequestMapping(value = "/deleteAnUser",method = RequestMethod.POST)
    public String deleteAnUser(@RequestParam("username") String username){
        userService.delUser(username);
        return "/WEB-INF/jsp/admin";
    }

    @RequestMapping(value = "/updateAnUser",method = RequestMethod.POST)
    public String updateAnUser(@RequestParam("oldUsername") String oldUsername,
                               @RequestParam("newUsername") String newUsername,
                               @RequestParam("newPassword") String password){
        adminService.updateUser(oldUsername,newUsername,password);
        return "/WEB-INF/jsp/admin";
    }

}
