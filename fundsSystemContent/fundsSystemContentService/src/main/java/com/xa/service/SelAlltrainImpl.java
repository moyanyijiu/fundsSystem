package com.xa.service;

import com.xa.mapper.TrainingtopicsMapper;
import com.xa.pojo.Trainingtopics;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SelAlltrainImpl implements SelAlltrain {

    @Resource
    private TrainingtopicsMapper tra;

    @Override
    public List<Trainingtopics> getAllTraByTop(Map map) {


        boolean topics = map.containsKey("topics");
        boolean b = map.containsValue("资金管理方案");
        List<Trainingtopics> trainingtopics = tra.selectByTopt(map);
        
        return trainingtopics;
    }

    @Override
    public List<String> getZtByTopics(String t) {

        List<String> ztByt = tra.getZtByt(t);

        return ztByt;
    }
}
