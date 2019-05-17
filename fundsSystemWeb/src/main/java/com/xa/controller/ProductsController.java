package com.xa.controller;

import com.xa.pojo.Custodianlist;
import com.xa.pojo.Products;
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

    @PostMapping("/getProductsById")
    @ResponseBody
    public Products getProductsById(HttpServletRequest request){
        int id=Integer.parseInt(request.getParameter("id"));
        return productsService.getProductsById(id);
    }

    @PostMapping("/getAllProducts")

    public List<Products> getAllDept() {

        System.out.println(productsService.getAllProducts());
        return productsService.getAllProducts();
    }

    @PostMapping("/order_detailczs")
    public Products order_detailczs(HttpServletRequest request){
        String pid1 = request.getParameter("pid");
        int pid=pid1==null?-1:Integer.parseInt(pid1);
        System.out.println("后台值为"+pid);
        Products products = productsService.selectByPrimaryKey(pid);
        System.out.println("产品细节为："+products);
        return  products;
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
