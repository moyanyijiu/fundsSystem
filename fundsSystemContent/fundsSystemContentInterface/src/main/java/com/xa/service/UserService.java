package com.xa.service;

import com.xa.pojo.User;

public interface UserService {
    User login(String username, String upassword);

    User selectByUserName(String username);
}
