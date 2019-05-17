package com.xa.service;

import com.xa.mapper.UserMapper;
import com.xa.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    UserMapper userMapper;
    @Override
    public User login(String username, String upassword) {
        return userMapper.login(username,upassword);
    }

    @Override
    public User selectByUserName(String username) {
        return userMapper.selectByUserName(username);
    }
}
