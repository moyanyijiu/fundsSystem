package com.xa.controller;

import com.xa.pojo.Trainingtopics;
import com.xa.service.SelAlltrain;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TraController {

    @Resource
    private SelAlltrain selAlltrain;

    @PostMapping("/selTra")
    @ResponseBody
    public List<Trainingtopics> getAllTraByTopt(HttpServletRequest request) throws UnsupportedEncodingException {

        String zt = request.getParameter("zt");

        String kj = request.getParameter("kj");

        String l = new String(kj.getBytes("ISO-8859-1"), "UTF-8");

        String t = new String(zt.getBytes("ISO-8859-1"), "UTF-8");



       Map<String,String> map=new HashMap<>();

       map.put("topics",t);

       map.put("courseware",l);

        List<Trainingtopics> allTraByTop = selAlltrain.getAllTraByTop(map);


        return allTraByTop ;
    }

    @PostMapping("/selZt")
    @ResponseBody
    public List<String> selZt(HttpServletRequest request) throws UnsupportedEncodingException {
        String zt = request.getParameter("zc");

        String z = new String(zt.getBytes("ISO-8859-1"), "UTF-8");


        List<String> ztByTopics = selAlltrain.getZtByTopics(z);


        return ztByTopics;

    }

}
