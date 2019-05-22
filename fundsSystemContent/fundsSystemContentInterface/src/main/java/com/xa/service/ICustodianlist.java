package com.xa.service;

import com.xa.pojo.Custodianlist;
import com.xa.pojo.CustodianlistExample;

import java.util.List;

public interface ICustodianlist {
    List<Custodianlist> selectByExample(CustodianlistExample example);

    Custodianlist selectByPrimaryKey(Integer mpid);
}
