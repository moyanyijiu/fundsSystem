package com.qf.test;

import com.xa.pojo.Orderlist;
import com.xa.service.OrderListService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-test.xml")
public class orderTest {
    @Resource
    OrderListService orderListService;
    @Test
    public void test(){
        List<Orderlist> orderlists = orderListService.selectByExample(null);
        for (Orderlist a:orderlists
             ) {
            System.out.println(a+"=");
        }
    }

}
