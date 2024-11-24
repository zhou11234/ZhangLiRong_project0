package com.zhou.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhou.dao.UserDao;
import com.zhou.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    UserDao userDao;

    //添加成员实现
    public void addUser(String username,String password){
        userDao.insert(new UserPojo(username,password));
    }

    //删除成员实现
    public void delUser(String username){
        userDao.deleteById(username);
    }

    //查询成员实现
    public List<UserPojo> findUserByName(String username) {
        List<UserPojo> pojo = userDao.selectList(new QueryWrapper<UserPojo>().eq("username", username));
        pojo.forEach(item -> {
            System.out.println(item);
        });
        return pojo; // 返回 List<UserPojo>
    }

}
