package com.xa.mapper;

import com.xa.pojo.Collectlist;
import com.xa.pojo.CollectlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectlistMapper {
    int countByExample(CollectlistExample example);

    int deleteByExample(CollectlistExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Collectlist record);

    int insertSelective(Collectlist record);

    List<Collectlist> selectByExample(CollectlistExample example);

    Collectlist selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Collectlist record, @Param("example") CollectlistExample example);

    int updateByExample(@Param("record") Collectlist record, @Param("example") CollectlistExample example);

    int updateByPrimaryKeySelective(Collectlist record);

    int updateByPrimaryKey(Collectlist record);
}