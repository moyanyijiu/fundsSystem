package com.xa.service;

import com.xa.pojo.Orderlist;
import com.xa.pojo.OrderlistExample;

import java.util.List;

public interface OrderListService {
    List<Orderlist> selectByExample(OrderlistExample example);
}
