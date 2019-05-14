package com.xa.mapper;

import com.xa.pojo.Trainingtopics;
import com.xa.pojo.TrainingtopicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainingtopicsMapper {
    int countByExample(TrainingtopicsExample example);

    int deleteByExample(TrainingtopicsExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Trainingtopics record);

    int insertSelective(Trainingtopics record);

    List<Trainingtopics> selectByExample(TrainingtopicsExample example);

    Trainingtopics selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Trainingtopics record, @Param("example") TrainingtopicsExample example);

    int updateByExample(@Param("record") Trainingtopics record, @Param("example") TrainingtopicsExample example);

    int updateByPrimaryKeySelective(Trainingtopics record);

    int updateByPrimaryKey(Trainingtopics record);
}