package com.xa.service;

import com.xa.mapper.CustodianlistMapper;
import com.xa.mapper.ProductsMapper;
import com.xa.pojo.Custodianlist;
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
    public Products selectByPrimaryKey(Integer pid) {
        return productsMapper.selectByPrimaryKey(pid);
    }
}
