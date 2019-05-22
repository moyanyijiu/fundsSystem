package com.xa.mapper;

import com.xa.pojo.Custodianlist;
import com.xa.pojo.CustodianlistExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustodianlistMapper {
    int countByExample(CustodianlistExample example);

    int deleteByExample(CustodianlistExample example);

    int deleteByPrimaryKey(Integer mpid);

    int insert(Custodianlist record);

    int insertSelective(Custodianlist record);

    List<Custodianlist> selectByExample(CustodianlistExample example);



    Custodianlist selectByPrimaryKey(Integer mpid);

    int updateByExampleSelective(@Param("record") Custodianlist record, @Param("example") CustodianlistExample example);

    int updateByExample(@Param("record") Custodianlist record, @Param("example") CustodianlistExample example);

    int updateByPrimaryKeySelective(Custodianlist record);

    int updateByPrimaryKey(Custodianlist record);
}