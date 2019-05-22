package com.xa.service;

import com.xa.mapper.CustodianlistMapper;
import com.xa.pojo.Custodianlist;
import com.xa.pojo.CustodianlistExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustodianlistServiceImpl implements ICustodianlist {
    @Resource
    CustodianlistMapper custodianlistMapper;
    @Override
    public List<Custodianlist> selectByExample(CustodianlistExample example) {
        return custodianlistMapper.selectByExample(null);
    }

    @Override
    public Custodianlist selectByPrimaryKey(Integer mpid) {
        return custodianlistMapper.selectByPrimaryKey(mpid);
    }
}
