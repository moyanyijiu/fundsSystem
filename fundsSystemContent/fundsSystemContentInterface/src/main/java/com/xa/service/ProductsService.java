package com.xa.service;

import com.sun.org.apache.xpath.internal.operations.String;
import com.xa.pojo.Custodianlist;
import com.xa.pojo.Orderlist;
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

    List<Orderlist> getOrdersByUid(int uid);

    //添加预约投资数据的方法
    boolean addOrderList(Orderlist orderlist);


    Products selectByPrimaryKey(Integer pid);

    List<Products> getProductPQ();

    //添加商品的方法
    boolean addProducts(Products products);
}
