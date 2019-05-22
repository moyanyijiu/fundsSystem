package com.xa.service;

import com.xa.mapper.UserMapper;
import com.xa.mapper.UserRoleMapper;
import com.xa.mapper.UsersMapper;
import com.xa.pojo.User;
import com.xa.pojo.UserDto;
import com.xa.pojo.UserRoleKey;
import com.xa.pojo.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    UserMapper userMapper;

    @Resource
    private UserRoleMapper urw;

    @Resource
    private UsersMapper usersMapper;

    @Override
    public User login(String username, String upassword) {
        return userMapper.login(username,upassword);
    }

    @Override
    public User selectByUserName(String username) {
        return userMapper.selectByUserName(username);

    }

    @Override
    public List<User> getAllUsers() {

        List<User> userList = userMapper.selectByExample(null);


        return userList;
    }

    @Override
    public boolean registu(User user) {

        return false;
    }

    @Override
    public boolean addUser(User user) {

        int insert = userMapper.insert(user);

        return insert > 0;
    }

    @Override
    public List<UserRoleKey> trt() {

        List<UserRoleKey> userRoleKeys = urw.getAllr();

        return userRoleKeys;
    }

    @Override
    public List<Users> getAllRole() {

        List<Users> allRole = usersMapper.getAllRole();

        return allRole;
    }

    @Override
    public User selectUserKey(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKeySelective4(User user) {
        return userMapper.updateByPrimaryKeySelective4(user);
    }

    /*后台代码*/
    @Override
    public List<UserDto> getAllUserDao() {
        return userMapper.selectUserDao();
    }

    @Override
    public List<User> selectUserlimit(Integer ids) {
        return userMapper.selectUserlimit(ids);
    }

    @Override
    public int deleteOneUser(Integer uid) {
        return userMapper.deleteOneUser(uid);
    }

    @Override
    public int updateOneUser(User user) {
        return userMapper.updateOneUser(user);
    }

}
