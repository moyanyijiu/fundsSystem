package com.xa.controller;

import com.xa.pojo.Dept;
import com.xa.service.DeptServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class DeptController {

    @Resource
    private DeptServer deptServer;

    @RequestMapping("/getDept")
    public List<Dept>  getAllDept(){
        return deptServer.getAllDept();
    }

}
