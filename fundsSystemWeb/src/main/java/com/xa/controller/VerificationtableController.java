package com.xa.controller;

import com.xa.pojo.Newslist;
import com.xa.pojo.User;
import com.xa.pojo.Verificationtable;
import com.xa.service.UserService;
import com.xa.service.UserinfoService;
import com.xa.service.VerificationtableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class VerificationtableController {

    @Resource
    private UserinfoService userinfoService;
    @Resource
    private UserService userService;
    @Resource
    VerificationtableService verificationtableService;

    /*更新信息认证表*/
    @PostMapping("updateVerificationtableService4")
    public  int  updateVerificationtableService4(Verificationtable verificationtable,HttpServletRequest request){
        if (verificationtable.getRedundancyone() == null){
            return  0;
        }
        User user =(User) request.getSession().getAttribute("user");
        Integer uid = user.getUid();
        String judge = request.getParameter("judge");
        if ("f1".equals(judge)){
            verificationtable.setAuthenticationstatus(1);
            Newslist newslist=new Newslist();
            newslist.setRedundancytwo(uid+"");
            newslist.setContent("亲爱的wanghe，恭喜您已通过使命实名。您可在[通知设置]选择希望收到的提醒。\n" +
                    "感谢您对爱投资一如既往的支持，希望我们的服务能够带来您财富的增长。");
            newslist.setNstaus("weidu");
            newslist.setServe("恭喜您通过实名认证");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
            String format = simpleDateFormat.format(System.currentTimeMillis());
            newslist.setNtime(format);
            newslist.setNdelete(0);
            int i = userinfoService.insertNewlist(newslist);
            int i1 = verificationtableService.updateVerificationtable4(verificationtable);
            return 1;
        }else if ("f2".equals(judge)){
            verificationtable.setPhonestaus(1);
            Newslist newslist=new Newslist();
            newslist.setRedundancytwo(uid+"");
            newslist.setContent("亲爱的wanghe，恭喜您已通过手机认证。您可在[通知设置]选择希望收到的提醒。\n" +
                    "感谢您对爱投资一如既往的支持，希望我们的服务能够带来您财富的增长。");
            newslist.setNstaus("weidu");
            newslist.setServe("恭喜您通过手机认证");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
            String format = simpleDateFormat.format(System.currentTimeMillis());
            newslist.setNtime(format);
            newslist.setNdelete(0);
            int i = userinfoService.insertNewlist(newslist);
            int i1 = verificationtableService.updateVerificationtable4(verificationtable);
            return  1;
        }else{
            verificationtable.setEmilestaus(1);

            Newslist newslist=new Newslist();
            newslist.setRedundancytwo(uid+"");
            newslist.setContent("亲爱的wanghe，恭喜您已通过邮箱认证。您可在[通知设置]选择希望收到的提醒。\n" +
                    "感谢您对爱投资一如既往的支持，希望我们的服务能够带来您财富的增长。");
            newslist.setNstaus("weidu");
            newslist.setServe("恭喜您通过邮箱认证");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
            String format = simpleDateFormat.format(System.currentTimeMillis());
            newslist.setNtime(format);
            newslist.setNdelete(0);
            int i = userinfoService.insertNewlist(newslist);
            int i1 = verificationtableService.updateVerificationtable4(verificationtable);
            return  1;
        }
    }

    @PostMapping("getAllVerificationtable")
    public List<Verificationtable> getAllVerificationtable(){
        return verificationtableService.getAllVerificationtable();
    }

    @PostMapping("selectOneVerificationtable")
    public String selectOneaVerificationtable(HttpServletRequest request){
        String redundancyone = request.getParameter("redundancyone");
        Verificationtable verificationtable1 = new Verificationtable();
        verificationtable1.setRedundancyone(redundancyone);
        Verificationtable verificationtable = verificationtableService.selectOneVerificationtable(verificationtable1);
        if (verificationtable == null){
            verificationtable=new Verificationtable();
            verificationtable.setEmilestaus(0);
            verificationtable.setPhonestaus(0);
            verificationtable.setAuthenticationstatus(0);
            verificationtable.setRedundancyone(redundancyone);
            int i = verificationtableService.insertVerificationtable4(verificationtable);
        }
        Integer authenticationstatus = verificationtable.getAuthenticationstatus();
        Integer phonestaus = verificationtable.getPhonestaus();
        Integer emilestaus = verificationtable.getEmilestaus();
        return authenticationstatus+"-"+phonestaus+"-"+emilestaus;
    }

    @PostMapping("UserIs")
    public String Useris(HttpServletRequest request){
        String judge = request.getParameter("judge");
        String redundancyone = request.getParameter("uid");
        Verificationtable verificationtable1 = new Verificationtable();
        verificationtable1.setRedundancyone(redundancyone);
        Verificationtable verificationtable = verificationtableService.selectOneVerificationtable(verificationtable1);
        Map<Integer,String> map=new HashMap<>();
        if ("f1".equals(judge)){
            Integer authenticationstatus = verificationtable.getAuthenticationstatus();
            if (authenticationstatus == 1){
                String name = verificationtable.getName();
                String identitycardnumber = verificationtable.getIdentitycardnumber();
                String iden=identitycardnumber.substring(identitycardnumber.length()-4,identitycardnumber.length());
                return name+"-"+iden;
            }
            return "null";
        }else if ("f2".equals(judge)){
            Integer phonestaus = verificationtable.getPhonestaus();
            if (phonestaus == 1){
                String name = verificationtable.getName();
                String cellphonenumber = verificationtable.getCellphonenumber();
                String phon=cellphonenumber.substring(cellphonenumber.length()-4,cellphonenumber.length());
                return phon;
            }
            return "null";
        }else {
            Integer emilestaus = verificationtable.getEmilestaus();
            if (emilestaus == 1){
                String name = verificationtable.getName();
                String emile = verificationtable.getEmile();
                String em=emile.substring(emile.length()-4,emile.length());
                return em;
            }
            return "null";
        }
    }


}
