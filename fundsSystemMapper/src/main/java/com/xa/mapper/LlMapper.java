package com.xa.mapper;

import com.xa.pojo.Ll;
import com.xa.pojo.LlExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LlMapper {
    int countByExample(LlExample example);

    int deleteByExample(LlExample example);

    int deleteByPrimaryKey(Integer lid);

    int insert(Ll record);

    int insertSelective(Ll record);

    List<Ll> selectByExample(LlExample example);

    Ll selectByPrimaryKey(Integer lid);

    int updateByExampleSelective(@Param("record") Ll record, @Param("example") LlExample example);

    int updateByExample(@Param("record") Ll record, @Param("example") LlExample example);

    int updateByPrimaryKeySelective(Ll record);

    int updateByPrimaryKey(Ll record);
}