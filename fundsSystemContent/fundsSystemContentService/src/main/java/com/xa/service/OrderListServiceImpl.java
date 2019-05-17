package com.xa.service;

import com.xa.mapper.OrderlistMapper;
import com.xa.pojo.Orderlist;
import com.xa.pojo.OrderlistExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OrderListServiceImpl implements OrderListService{
    @Resource
    private OrderlistMapper orderlistMapper;
    @Override
    public List<Orderlist> selectByExample(OrderlistExample example) {
        return orderlistMapper.selectByExample(null);
    }
}
