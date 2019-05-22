package com.xa.service;

import com.xa.pojo.Orderlist;
import com.xa.pojo.OrderlistExample;
import org.aspectj.weaver.ast.Or;

import java.util.List;

public interface OrderListService {
    List<Orderlist> selectByExample(OrderlistExample example);
    Orderlist getOrderlistNyId(int oid);
    boolean getShouCang(int uid,int pid);
    boolean addShoucang(int uid,int pid);
}
