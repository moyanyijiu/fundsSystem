package com.xa.realm;

import com.xa.pojo.User;
import com.xa.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Myrealm extends AuthorizingRealm {
    @Resource
    UserService userService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        SimpleAuthenticationInfo info=null;
        UsernamePasswordToken tk = (UsernamePasswordToken) authenticationToken;
        String username = tk.getUsername();
        char[] password1 = tk.getPassword();
        String password=new String(password1);
        System.out.println(username+"登陆的用户名和密码："+password+"走Myrealm到这一步");

        User login = userService.login(username, password);
        System.out.println("shiro认证信息："+login.toString());
        if(login!=null){
            info=new SimpleAuthenticationInfo(username,password,getName());
        }
        return info;
    }
}
