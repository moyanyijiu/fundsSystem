package com.xa.controller;

import com.xa.pojo.Ll;
import com.xa.service.ILlService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class LlController {
    @Resource
    ILlService llService;
    @PostMapping("/lyczs123")
    @ResponseBody
    public int lyczs123(Ll ll){
        int a = llService.insert(ll);
        return a;
    }
}
