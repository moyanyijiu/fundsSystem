package com.xa.service;

import com.xa.mapper.CollectlistMapper;
import com.xa.mapper.OrderlistMapper;
import com.xa.pojo.Collectlist;
import com.xa.pojo.CollectlistExample;
import com.xa.pojo.Orderlist;
import com.xa.pojo.OrderlistExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OrderListServiceImpl implements OrderListService{
    @Resource
    private OrderlistMapper orderlistMapper;

    @Resource
    private CollectlistMapper collectlistMapper;
    @Override
    public List<Orderlist> selectByExample(OrderlistExample example) {
        return orderlistMapper.selectByExample(null);
    }

    @Override
    public Orderlist getOrderlistNyId(int oid) {
        return orderlistMapper.selectByPrimaryKey(oid);
    }

    @Override
    public boolean getShouCang(int uid, int pid) {
        CollectlistExample example = new CollectlistExample();
        CollectlistExample.Criteria criteria = example.createCriteria();
        criteria.andProductsidEqualTo(pid);
        criteria.andUidEqualTo(uid);
        List<Collectlist> collectlists = collectlistMapper.selectByExample(example);
        return collectlists.isEmpty();
    }

    @Override
    public boolean addShoucang(int uid, int pid) {
        Collectlist collectlist=new Collectlist();
        collectlist.setProductsid(pid);
        collectlist.setUid(uid);
        collectlist.setColdel(0);
        int insert = collectlistMapper.insert(collectlist);
        return insert > 0;
    }

}
