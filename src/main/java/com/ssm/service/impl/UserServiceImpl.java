package com.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.dao.UserMapper;
import com.ssm.entity.User;
import com.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User searchById(int id){
        return userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Transactional
    @Override
    public int delete(int id){
        return userMapper.deleteByPrimaryKey(id);
    }

}
