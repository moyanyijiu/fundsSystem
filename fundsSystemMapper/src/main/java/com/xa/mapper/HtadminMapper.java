package com.xa.mapper;

import com.xa.pojo.Htadmin;
import com.xa.pojo.HtadminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HtadminMapper {
    int countByExample(HtadminExample example);

    int deleteByExample(HtadminExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Htadmin record);

    int insertSelective(Htadmin record);

    List<Htadmin> selectByExample(HtadminExample example);

    List<Htadmin> selectBypage(int start,int end);

    Htadmin selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Htadmin record, @Param("example") HtadminExample example);

    int updateByExample(@Param("record") Htadmin record, @Param("example") HtadminExample example);

    int updateByPrimaryKeySelective(Htadmin record);

    int updateByPrimaryKey(Htadmin record);
}