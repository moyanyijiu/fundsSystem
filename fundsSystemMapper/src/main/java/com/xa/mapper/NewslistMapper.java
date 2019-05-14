package com.xa.mapper;

import com.xa.pojo.Newslist;
import com.xa.pojo.NewslistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewslistMapper {
    int countByExample(NewslistExample example);

    int deleteByExample(NewslistExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(Newslist record);

    int insertSelective(Newslist record);

    List<Newslist> selectByExample(NewslistExample example);

    Newslist selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") Newslist record, @Param("example") NewslistExample example);

    int updateByExample(@Param("record") Newslist record, @Param("example") NewslistExample example);

    int updateByPrimaryKeySelective(Newslist record);

    int updateByPrimaryKey(Newslist record);
}