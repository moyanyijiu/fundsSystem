package com.xa.controller;

import com.xa.pojo.Custodianlist;
import com.xa.service.ICustodianlist;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CustodianlistController {
    @Resource
    ICustodianlist iCustodianlist;
    @PostMapping("/custodianlistCZS")
    @ResponseBody
    public Custodianlist custodianlistCZS(HttpServletRequest request){
        String mpid1 = request.getParameter("mpid");
        int mpid=mpid1==null?-1:Integer.parseInt(mpid1);
        Custodianlist custodianlist = iCustodianlist.selectByPrimaryKey(mpid);
        return  custodianlist;
    }
}
