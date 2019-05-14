package com.xa.controller;

import com.xa.pojo.Products;
import com.xa.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProductsController {

    @Resource
    private ProductsService productsService;

    @PostMapping("/getAllProducts")
    @ResponseBody
    public List<Products>  getAllDept(){
        return productsService.getAllProducts();
    }
}
