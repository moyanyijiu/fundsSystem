package com.xa.mapper;

import com.xa.pojo.Capitalsource;
import com.xa.pojo.CapitalsourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CapitalsourceMapper {
    int countByExample(CapitalsourceExample example);

    int deleteByExample(CapitalsourceExample example);

    int deleteByPrimaryKey(Integer capid);

    int insert(Capitalsource record);

    int insertSelective(Capitalsource record);

    List<Capitalsource> selectByExample(CapitalsourceExample example);

    Capitalsource selectByPrimaryKey(Integer capid);

    int updateByExampleSelective(@Param("record") Capitalsource record, @Param("example") CapitalsourceExample example);

    int updateByExample(@Param("record") Capitalsource record, @Param("example") CapitalsourceExample example);

    int updateByPrimaryKeySelective(Capitalsource record);

    int updateByPrimaryKey(Capitalsource record);
}