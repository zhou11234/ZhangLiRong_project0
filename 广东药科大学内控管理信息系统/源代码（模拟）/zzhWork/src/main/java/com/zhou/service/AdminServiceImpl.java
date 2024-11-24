package com.zhou.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhou.dao.AdminDao;
import com.zhou.dao.UserDao;
import com.zhou.pojo.AdminPojo;
import com.zhou.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl {

    @Autowired
    AdminDao adminDao;

    @Autowired
    UserDao userDao;

    //查询管理员账号
    public List<AdminPojo> findAdminByName(String username){
        List<AdminPojo> pojo = adminDao.selectList(new QueryWrapper<AdminPojo>().eq("username", username));
        pojo.forEach(item -> {
            System.out.println(item);
        });
        return pojo;
    }

    //查询所有用户
    public List<UserPojo> findAllUsers() {
        List<UserPojo> pojo = userDao.selectList(new QueryWrapper<>()); // 不设置条件
        pojo.forEach(item -> {
            System.out.println(item);
        });
        return pojo;
    }

    //修改一名用户
    public void updateUser(String oldUsername,String newUsername,String password){
        UserPojo pojo = userDao.selectById(oldUsername);
        pojo.setUsername(newUsername);
        pojo.setPassword(password);
//        userDao.update(pojo,new QueryWrapper<UserPojo>().eq("username",oldUsername));
        userDao.deleteById(oldUsername);
        userDao.insert(pojo);
    }

}