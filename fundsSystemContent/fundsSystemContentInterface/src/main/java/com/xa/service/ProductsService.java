package com.xa.service;

import com.xa.pojo.Products;

import java.util.List;
import java.util.Map;

public interface ProductsService {
    //查询所有
    List<Products> getAllProducts();

    //根据字段查询
    List<Products> getAllProductsByField(Map map);

    Products selectByPrimaryKey(Integer pid);
}
