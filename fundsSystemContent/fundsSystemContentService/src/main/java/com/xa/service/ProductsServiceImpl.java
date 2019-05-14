package com.xa.service;

import com.xa.mapper.ProductsMapper;
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

    @Override
    public List<Products> getAllProducts() {
        return productsMapper.selectByExample(null);
    }

    @Override
    public List<Products> getAllProductsByField(Map map) {
        return productsMapper.selectByField(map);
    }
}

