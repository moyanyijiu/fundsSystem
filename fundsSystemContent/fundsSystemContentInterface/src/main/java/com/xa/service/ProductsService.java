package com.xa.service;

import com.sun.org.apache.xpath.internal.operations.String;
import com.xa.pojo.Custodianlist;
import com.xa.pojo.Products;

import java.util.List;
import java.util.Map;

public interface ProductsService {
    //查询所有
    List<Products> getAllProducts();

    //根据字段查询
    List<Products> getAllProductsByField(Map map);

    //根据主键查出一个管理员对象
    Custodianlist getCustodianlistById(int id);

    //根据主键查出一个产品对象
    Products getProductsById(int id);

}
