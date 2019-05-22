package com.xa.controller;

import com.xa.pojo.*;
import com.xa.service.DeptServer;
import com.xa.service.UserService;
import com.xa.service.UserinfoService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.mybatis.spring.SqlSessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class UserController {
    @Resource
    UserService userService;

    @Resource
    private DeptServer deptServer;

    @Resource
    UserinfoService userinfoService;


    @PostMapping("insertUserinfo")
    @ResponseBody
    public int insetUserinfo(Userinfo userinfo,HttpServletRequest request){
        /*User usera =new User();
        usera.setUsername("huahua");
        usera.setUid(2);
        request.getSession().setAttribute("user",usera);*/
        User user = (User)request.getSession().getAttribute("user");
        int uid = user.getUid();
        userinfo.setUid(uid);
        return userinfoService.inserUserInfo(userinfo);
    }

    @PostMapping("getUid")
    @ResponseBody
    public int getid(HttpServletRequest re){
        User user = (User)re.getSession().getAttribute("user");
        int uid = user.getUid();
        return uid;
    }

    @PostMapping("getNameaaa")
    @ResponseBody
    public String getnameaaa(HttpServletRequest re){
        User user = (User)re.getSession().getAttribute("user");
        if (user != null){
        String username = user.getUsername();
        return username;}
        return null;
    }

    @PostMapping("usermessage")
    @ResponseBody
    public List<Newslist> userMessage(HttpServletRequest re){
        User user = (User)re.getSession().getAttribute("user");
        int uid = user.getUid();
        List<Newslist> getnewlist = userinfoService.getnewlist(uid);
        return getnewlist;
    }


    @PostMapping("htlogin")
    @ResponseBody
    public String htlogin(HttpServletRequest re){
        String logname = re.getParameter("logname");
        String logpass = re.getParameter("logpass");
        if ("admin" .equals(logname) && "admin".equals(logpass)){
            return "1";
        }
        return null;
    }

    @PostMapping("getUsrein")
    @ResponseBody
    public Userinfo getusrein(HttpServletRequest re){
        User user = (User)re.getSession().getAttribute("user");
        int uid = user.getUid();
        Userinfo userINfoByuid = userinfoService.getUserINfoByuid(uid);
        if (userINfoByuid != null){
            return userINfoByuid;
        }else {
            return null;
        }}

    @PostMapping("/userlogin")
    @ResponseBody
    public String userlogin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String code_input=request.getParameter("code");
        String code_image=(String) request.getSession().getAttribute("rand");
        if (code_input.equals(code_image)){
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            try {
                subject.login(token);
                User user = userService.selectByUserName(username);
                request.getSession().setAttribute("user",user);
                return "utrue";
            }catch(AuthenticationException e){
                e.printStackTrace();
                return "ufalse";
            }
        }else{
        return "cfalse";
        }
    }


    @PostMapping("/registU")
    @ResponseBody
    public String registu(HttpServletRequest request) throws UnsupportedEncodingException {
        String username = request.getParameter("u");

        boolean bcunZai = isCunZai(username);
        if (bcunZai) {

            return "0";
        }
        return "1";
    }

    public boolean isCunZai(String name) {
        boolean isCunZai = true;

        List<User> allUser = userService.getAllUsers();

        for (User u : allUser
        ) {
            if (name.equals(u.getUsername())) {
                isCunZai = false;
                break;
            }
        }
        return isCunZai;
    }

    @GetMapping("/overUser")
    public String overUser(HttpServletRequest request) {
        String uname = request.getParameter("uname");
        String upass = request.getParameter("upass");

        User user = new User();
        user.setUsername(uname);
        user.setUpassword(upass);

       boolean b = userService.addUser(user);

       if (b){
           Newslist newslist=new Newslist();
           User login = userService.login(uname, upass);
           Integer uid = login.getUid();
           newslist.setRedundancytwo(uid+"");
           newslist.setContent("海黄金交易所开户要求及流程： 1、 开户要求：凡属国内热衷或需求黄金、铂金和白银实物与投资投机的机构均可按上海黄金交易所的开户要求由会员协助办理开户手续。" +
                   " 2、 须提供的资料： （1）营业执照 （2）组织机构代码证 （3）税务登记证国税、地税开户完成。");
           newslist.setNstaus("weidu");
           newslist.setServe("注册成功");
           SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
           String format = simpleDateFormat.format(System.currentTimeMillis());
           newslist.setNtime(format);
           newslist.setNdelete(0);
           int i = userinfoService.insertNewlist(newslist);
       }

        return "redirect:/successful.html";
    }

    @PostMapping("/newlistlko")
    @ResponseBody
    public int newlIstlko(HttpServletRequest request) {
        String asd = request.getParameter("asd");
        int nid=Integer.parseInt(asd);
        Newslist newslist = userinfoService.getNewByTwo(nid);
        newslist.setNstaus("yidu");
        int i = userinfoService.updateNewList(newslist);
        return i;
    }

    @PostMapping("/selAlltrain")
    @ResponseBody
    public List<Trainingtopics> selAlltrain() {


        List<Trainingtopics> allTra = deptServer.getAllTra();


        return allTra;
    }

    @GetMapping("getOneUser")
    @ResponseBody
//@RequestParam String uid, @RequestParam String password1,@RequestParam String password2,@RequestParam String password3
    public int getOneUser(HttpServletRequest request) {
        String id = request.getParameter("uid");
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");
        String password3 = request.getParameter("password3");
        int uid = id!=null?Integer.parseInt(id):-1;
        User user = userService.selectUserKey(uid);
        if (user.getUpassword().equals(password1)) {
            if(password2.equals(password3)){
                User user1 = new User();
                user1.setUid(uid);
                user1.setUpassword(password2);
                int i = userService.updateByPrimaryKeySelective4(user1);
                return i;
            }else {
                return 3;
            }
        } else {
            return 2;
        }

    }

    /*后台代码 ----》》》》》这是dto的所有数据******************************/
    @GetMapping("getAllUserDto")
    @ResponseBody
    public List<UserDto> getAllUser(){
        return userService.getAllUserDao();
    }

    @GetMapping("selectUserlimit")
    @ResponseBody
    public List<User> selectUserlimit(HttpServletRequest request){
        String id = request.getParameter("id");
        int ids = id!=null?Integer.parseInt(id):0;
        List<User> users = userService.selectUserlimit(ids);
        return users;
    }

    @GetMapping("/ht/updateOneUser")
    @ResponseBody
    public int updateOneUser(User user){
        int i = userService.updateOneUser(user);
        return i;
    }


    @GetMapping("selectsOneUser")
    @ResponseBody
    public User selectsOneUser(HttpServletRequest request){
        String uids = request.getParameter("id");
        int uid = uids!=null?Integer.parseInt(uids):0;
        User user = userService.selectUserKey(uid);
        return user;
    }

    @GetMapping("delectOneUser")
    @ResponseBody
    public int delectOneUser(HttpServletRequest request){
        String uids = request.getParameter("id");
        int uid = uids!=null?Integer.parseInt(uids):0;
        int i = userService.deleteOneUser(uid);
        return i;
    }
}
