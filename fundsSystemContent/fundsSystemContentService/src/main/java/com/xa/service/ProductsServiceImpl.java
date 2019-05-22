package com.xa.service;

import com.xa.mapper.CustodianlistMapper;
import com.xa.mapper.OrderlistMapper;
import com.xa.mapper.ProductsMapper;
import com.xa.pojo.Custodianlist;
import com.xa.pojo.Orderlist;
import com.xa.pojo.OrderlistExample;
import com.xa.pojo.Products;
import org.junit.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ProductsServiceImpl implements ProductsService {
    @Resource
    private ProductsMapper productsMapper;
    @Resource
    private CustodianlistMapper custodianlistMapper;
    @Resource
    private OrderlistMapper orderlistMapper;

    @Override
    public List<Products> getAllProducts() {
        return productsMapper.selectByExample(null);
    }

    @Override
    public List<Products> getAllProductsByField(Map map) {
        return productsMapper.selectByField(map);
    }

    @Override
    public Custodianlist getCustodianlistById(int id) {

        return custodianlistMapper.selectByPrimaryKey(id) ;
    }

    @Override
    public Products getProductsById(int id) {
        return productsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Orderlist> getOrdersByUid(int uid) {
        OrderlistExample example = new OrderlistExample();
        OrderlistExample.Criteria criteria = example.createCriteria();
        criteria.andRedundancyoneEqualTo(uid+"");
        return orderlistMapper.selectByExample(example);
    }

    @Override
    public boolean addOrderList(Orderlist orderlist) {
        int insert = orderlistMapper.insert(orderlist);
        return insert!=0;
    }

    @Override
    public Products selectByPrimaryKey(Integer pid) {
        return productsMapper.selectByPrimaryKey(pid);
    }

    @Override
    public List<Products> getProductPQ() {
        return productsMapper.getProductPQ();
    }
    @Override
    public boolean addProducts(Products products) {
        int insert = productsMapper.insert(products);
        return insert!=0;
    }
}

