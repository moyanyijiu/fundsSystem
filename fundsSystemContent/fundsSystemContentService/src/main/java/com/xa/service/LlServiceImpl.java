package com.xa.service;

import com.xa.mapper.LlMapper;
import com.xa.pojo.Ll;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LlServiceImpl implements ILlService {
    @Resource
    LlMapper llMapper;
    @Override
    public int insert(Ll record) {
        return llMapper.insert(record);
    }
}
