package com.xa.service;

import com.xa.pojo.User;
import com.xa.pojo.UserDto;
import com.xa.pojo.UserRoleKey;
import com.xa.pojo.Users;

import java.util.List;

public interface UserService {
    User login(String username, String upassword);

    User selectByUserName(String username);

    List<User> getAllUsers();

    boolean registu(User user);

    boolean addUser(User user);

    List<UserRoleKey> trt();

    List<Users> getAllRole();

    User selectUserKey(Integer  uid);

    int updateByPrimaryKeySelective4(User user);

    /*后台代码*/
    List<UserDto> getAllUserDao();

    List<User> selectUserlimit(Integer ids);

    int deleteOneUser(Integer uid);

    int updateOneUser(User user);
}
