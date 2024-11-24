package com.zhou.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhou.pojo.AdminPojo      ;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminDao extends BaseMapper<AdminPojo> {

}
