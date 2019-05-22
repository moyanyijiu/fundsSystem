package com.xa.controller;

import com.alibaba.druid.sql.visitor.functions.If;
import com.xa.pojo.Custodianlist;
import com.xa.pojo.Orderlist;
import com.xa.pojo.Products;
import com.xa.pojo.User;
import com.xa.service.OrderListService;
import com.xa.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductsController {

    @Resource
    private ProductsService productsService;

    @Resource
    private OrderListService orderListService;

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
        orderlist.setOrdertime("未下单");
        orderlist.setReservationamount(je);
        orderlist.setAppointmentdate(rq);
        orderlist.setRedundancyone(user.getUid()+"");
        boolean b = productsService.addOrderList(orderlist);
        return "success";
    }

    @PostMapping("/getProductsById")
    @ResponseBody
    public Products getProductsById(HttpServletRequest request){
        int id=Integer.parseInt(request.getParameter("id"));
        return productsService.getProductsById(id);
    }

    @PostMapping("/getAllProducts")
    public List<Products> getAllDept() {

        return productsService.getAllProducts();
    }

    @PostMapping("/getAllOrder")
    @ResponseBody
    public Map<String,Orderlist> getAllOrders(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        int uid=user.getUid();
        List<Orderlist> ordersByUid = productsService.getOrdersByUid(uid);
        Map<String,Orderlist> map=new HashMap<>();
        for (Orderlist o:ordersByUid
             ) {
            Integer pid = o.getPid();
            String productname = productsService.getProductsById(pid).getProductname();
            map.put(productname,o);
        }
        return map;
    }

    @PostMapping("/order_detailczs")
    public Map<String,Products> order_detailczs(HttpServletRequest request){
        int oid = Integer.parseInt(request.getParameter("oid"));
        Orderlist orderlistNyId = orderListService.getOrderlistNyId(oid);
        String st=orderlistNyId.getStatus();
        Map<String,Products> map=new HashMap<>();
        String pid1 = request.getParameter("pid");
        int pid=pid1==null?-1:Integer.parseInt(pid1);
        Products products = productsService.selectByPrimaryKey(pid);
        map.put(st,products);
        return  map;
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

    @PostMapping("/shoucangta")
    @ResponseBody
    public String getsgoucang(HttpServletRequest request){

        if (request.getParameter("pid") != null){
            int pid=Integer.parseInt(request.getParameter("pid"));
            User user =(User) request.getSession().getAttribute("user");
            Integer uid = user.getUid();
            boolean shouCang = orderListService.getShouCang(uid, pid);
            return  "true1";
        }
        return "login";
    }

    @PostMapping("/shoucangjia")
    @ResponseBody
    public boolean shoucangj(HttpServletRequest request){
        int pid=Integer.parseInt(request.getParameter("pid"));
        User user =(User) request.getSession().getAttribute("user");
        Integer uid = user.getUid();

        boolean resulet = orderListService.addShoucang(uid, pid);
        return  resulet;
    }

    @PostMapping("/productsCZS")
    @ResponseBody
    public List<Products> productsCZS(){
        List<Products> productPQ = productsService.getProductPQ();
        return productPQ;
    }

    @PostMapping("/addProduct")
    public String addProduct(Products products){
        boolean b = productsService.addProducts(products);
        return "redirect:/ht/productTables.html";
    }

}
