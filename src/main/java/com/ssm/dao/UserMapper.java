package com.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.User;

public interface UserMapper {

    public int deleteByPrimaryKey(@Param(value = "id") int id);

    public int insert(User user);

    public User selectByPrimaryKey(@Param(value = "id") int id);
}
