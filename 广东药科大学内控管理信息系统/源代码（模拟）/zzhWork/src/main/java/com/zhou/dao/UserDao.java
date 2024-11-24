package com.zhou.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhou.pojo.UserPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<UserPojo> {
}
