package com.xa.service;

import com.xa.pojo.Trainingtopics;

import java.util.List;
import java.util.Map;

public interface SelAlltrain {

    List<Trainingtopics> getAllTraByTop(Map map);

    List<String> getZtByTopics(String t);

}
