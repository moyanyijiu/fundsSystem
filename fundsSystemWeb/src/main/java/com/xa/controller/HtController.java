package com.xa.controller;

import com.xa.pojo.Htadmin;
import com.xa.service.HtService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HtController {
    @Resource
    private HtService htService;

    @PostMapping("/gethtAdmin")
    @ResponseBody
    public List<Htadmin> getHtamin(){

        List<Htadmin> allHta = htService.getAllHta();

        return allHta;

    }
    @PostMapping("/selOneAdmin")
    @ResponseBody
    public Htadmin getOneAdmin(){

        Htadmin oneAdm = htService.getOneAdm(1);


        return oneAdm;
    }

    @PostMapping("/gxXx")
    public String upGx(Htadmin htadmin){

        boolean b = htService.updAdm(htadmin);


        return "redirect:http://localhost:8088/ht/user-profile-lite.html";
    }

    @PostMapping("/allDev")
    @ResponseBody
    public List<Htadmin> getPaget(HttpServletRequest request) {

        String onep = request.getParameter("tpa");
        String cpage = request.getParameter("cpage");
        int p = Integer.parseInt(cpage);


        if("next".equals(onep)){
            if(p >= 1){
                p = p+1;
            }
        }
        if("up".equals(onep)){
            if(p > 1){
                p = p-1;
            }
        }

        int paget=(p - 1)*3 ;

        List<Htadmin> page = htService.getPage(paget, 3);



        return page;
    }

    @GetMapping("/delHtadm")
    public String delHtadm(HttpServletRequest request){
        String aid = request.getParameter("aid");

        int i = Integer.parseInt(aid);

        boolean b = htService.delAdm(i);

        return "redirect:http://localhost:8088/ht/user-profile-lite.html";
    }
}
