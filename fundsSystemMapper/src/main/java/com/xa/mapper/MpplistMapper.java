package com.xa.mapper;

import com.xa.pojo.Mpplist;
import com.xa.pojo.MpplistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MpplistMapper {
    int countByExample(MpplistExample example);

    int deleteByExample(MpplistExample example);

    int deleteByPrimaryKey(Integer mpPid);

    int insert(Mpplist record);

    int insertSelective(Mpplist record);

    List<Mpplist> selectByExample(MpplistExample example);

    Mpplist selectByPrimaryKey(Integer mpPid);

    int updateByExampleSelective(@Param("record") Mpplist record, @Param("example") MpplistExample example);

    int updateByExample(@Param("record") Mpplist record, @Param("example") MpplistExample example);

    int updateByPrimaryKeySelective(Mpplist record);

    int updateByPrimaryKey(Mpplist record);
}