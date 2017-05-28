package com.ssm.service;

import com.ssm.entity.User;

public interface UserService {

    public User searchById(int id);

    public int insert(User user);

    public int delete(int id);
}
