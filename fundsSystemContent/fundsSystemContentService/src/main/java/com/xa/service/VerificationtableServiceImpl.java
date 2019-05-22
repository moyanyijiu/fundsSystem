package com.xa.service;

import com.xa.mapper.VerificationtableMapper;
import com.xa.pojo.Verificationtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerificationtableServiceImpl implements VerificationtableService {
    @Autowired
    VerificationtableMapper verificationtableMapper;

    @Override
    public int updateVerificationtable4(Verificationtable verificationtable) {
        return verificationtableMapper.updateVerificationtable(verificationtable);
    }

    @Override
    public int insertVerificationtable4(Verificationtable verificationtable) {
        return verificationtableMapper.insertSelective(verificationtable);
    }

    @Override
    public List<Verificationtable> getAllVerificationtable() {
        return verificationtableMapper.selectByExample(null);
    }

    @Override
    public Verificationtable selectOneVerificationtable(Verificationtable verificationtable) {

        return verificationtableMapper.selectOneVerificationtable(verificationtable);
    }
}
