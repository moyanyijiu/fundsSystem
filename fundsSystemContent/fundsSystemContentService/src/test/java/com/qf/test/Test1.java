package com.qf.test;

import com.xa.pojo.Products;
import com.xa.service.ProductsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-test.xml")
public class Test1 {

    @Resource
    private ProductsService productsService;
    @Test
    public void testGetAllProducts(){
        /*List<Products> allProducts = productsService.getAllProducts();
        System.out.println(allProducts);*/
        HashMap<String, String > map = new HashMap<>();
        map.put("biddeadline","0~3个月");
        map.put("ptype",null);
        map.put("riskgrade",null);
        List<Products> allProductsByField = productsService.getAllProductsByField(map);
        for (Products p:allProductsByField
             ) {
            System.out.println(p);
        }

    }
    @Test
    public void test2(){
        List<Products> allProducts = productsService.getAllProducts();
        for (Products a:allProducts
             ) {
            System.out.println(a);
        }
    }
    @Test
    public void test3(){
        Products products = productsService.selectByPrimaryKey(2);
        System.out.println(products);
    }
}
