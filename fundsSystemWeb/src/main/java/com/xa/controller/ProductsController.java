package com.xa.controller;

import com.xa.pojo.Custodianlist;
import com.xa.pojo.Orderlist;
import com.xa.pojo.Products;
import com.xa.pojo.User;
import com.xa.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
public class ProductsController {

    @Resource
    private ProductsService productsService;

    @PostMapping("/yuYue")
    @ResponseBody
    public String yuYue(HttpServletRequest request){
        User user = (User)request.getSession().getAttribute("user");
        String je=request.getParameter("je");
        double je1=Double.parseDouble(je);
        String rq=request.getParameter("rq");
        int id=Integer.parseInt(request.getParameter("id"));
        if (je1<1000000.00){
            return "fail";
        }
        Orderlist orderlist = new Orderlist();
        orderlist.setPid(id);
        orderlist.setStatus("已预约");
        orderlist.setReservationamount(je);
        orderlist.setAppointmentdate(rq);
        orderlist.setRedundancyone(user.getUid()+"");
        boolean b = productsService.addOrderList(orderlist);
        System.out.println(b);
        return "success";
    }

    @PostMapping("/getProductsById")
    @ResponseBody
    public Products getProductsById(HttpServletRequest request){
        int id=Integer.parseInt(request.getParameter("id"));
        return productsService.getProductsById(id);
    }

    @PostMapping("/getAllProducts")
    @ResponseBody
    public List<Products>  getAllDept(){
        return productsService.getAllProducts();
    }

    @PostMapping("/getCustodianlist")
    @ResponseBody
    public Custodianlist getCustodianlist(HttpServletRequest request){
        int id=Integer.parseInt(request.getParameter("id"));
        return  productsService.getCustodianlistById(id);
    }

    @PostMapping("/getAllProductsByField")
    @ResponseBody
    public List<Products> getAllProductsByField(HttpServletRequest request){
        int num=Integer.parseInt(request.getParameter("num"));
        String s=request.getParameter("s");
        HashMap<String, String> map = new HashMap<>();
        if (num==1){
            map.put("ptype",s);
            map.put("riskgrade",null);
            map.put("biddeadline",null);
        }
        if (num==2){
            map.put("ptype",null);
            map.put("riskgrade",s);
            map.put("biddeadline",null);
        }
        if (num==3){
            map.put("ptype",null);
            map.put("riskgrade",null);
            map.put("biddeadline",s);
        }
        List<Products> allProductsByField = productsService.getAllProductsByField(map);
        return  allProductsByField;
    }
}
