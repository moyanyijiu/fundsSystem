package com.xa.service;

import com.xa.pojo.User;
import com.xa.pojo.UserRoleKey;
import com.xa.pojo.Users;

import java.util.List;

public interface IUserService {

    List<User> getAllUsers();

    boolean registu(User user);

    boolean addUser(User user);

    List<UserRoleKey> trt();

    List<Users> getAllRole();
}
