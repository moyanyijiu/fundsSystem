package com.qf.test;


import com.xa.pojo.Orderlist;
import com.xa.pojo.Products;
import com.xa.pojo.User;
import com.xa.pojo.UserDto;
import com.xa.service.OrderListService;
import com.xa.service.ProductsService;
import com.xa.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-test.xml")
public class test {
    @Resource
    private UserService userService;

    @Resource
    private ProductsService productsService;

    @Resource
    private OrderListService orderListService;
    @Test
    public void test(){
        List<Products> allProducts = productsService.getAllProducts();
        System.out.println(allProducts);

    }

    @Test
    public void test1(){
        List<Orderlist> ordersByUid = productsService.getOrdersByUid(1);
        System.out.println(ordersByUid);

    }

    @Test
    public void test2(){
        Orderlist orderlistNyId = orderListService.getOrderlistNyId(1);
        System.out.println(orderlistNyId);

    }
    @Test
    public void test3(){
        User czs = userService.selectByUserName("czs");
        System.out.println(czs);

    }
    @Test
    public void test4(){
        List<UserDto> allUserDao = userService.getAllUserDao();
        System.out.println(allUserDao);

    }
}
