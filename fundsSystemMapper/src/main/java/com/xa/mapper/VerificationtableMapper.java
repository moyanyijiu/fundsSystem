package com.xa.mapper;

import com.xa.pojo.Verificationtable;
import com.xa.pojo.VerificationtableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VerificationtableMapper {
    int countByExample(VerificationtableExample example);

    int deleteByExample(VerificationtableExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(Verificationtable record);

    int insertSelective(Verificationtable record);

    List<Verificationtable> selectByExample(VerificationtableExample example);

    Verificationtable selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") Verificationtable record, @Param("example") VerificationtableExample example);

    int updateByExample(@Param("record") Verificationtable record, @Param("example") VerificationtableExample example);

    int updateByPrimaryKeySelective(Verificationtable record);

    int updateByPrimaryKey(Verificationtable record);
}