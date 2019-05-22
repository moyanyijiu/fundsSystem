package com.xa.mapper;

import com.xa.pojo.User;
import com.xa.pojo.UserDto;
import com.xa.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    int updateByPrimaryKeySelective4(User user);

    User selectByUserName(String username);

    User login(String username,String upassword);

    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /*后台代码*/
    List<UserDto> selectUserDao();

    List<User> selectUserlimit(Integer ids);

    int deleteOneUser(Integer uid);

    int updateOneUser(User user);
}