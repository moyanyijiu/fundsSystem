package com.xa.service;

import com.xa.mapper.NewslistMapper;
import com.xa.mapper.UserinfoMapper;
import com.xa.pojo.Newslist;
import com.xa.pojo.NewslistExample;
import com.xa.pojo.Userinfo;
import com.xa.pojo.UserinfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserinfoServiceImpl implements UserinfoService {
    @Autowired
    UserinfoMapper userinfoMapper;

    @Resource
    private NewslistMapper newslistMapper;
    @Override
    public int inserUserInfo(Userinfo userinfo) {
        return userinfoMapper.insert(userinfo);
    }

    @Override
    public Userinfo getUserINfoByuid(int uid) {
        Userinfo userinfo=new Userinfo();
        UserinfoExample example = new UserinfoExample();
        UserinfoExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        List<Userinfo> userinfos = userinfoMapper.selectByExample(example);
        if (!userinfos.isEmpty()){
            userinfo = userinfos.get(0);
        }else {
        userinfo=null;
        }
        return userinfo;
    }

    @Override
    public int insertNewlist(Newslist newslist) {

        return newslistMapper.insert(newslist);
    }

    @Override
    public List<Newslist> getnewlist(int uid) {
        NewslistExample example = new NewslistExample();
        NewslistExample.Criteria criteria = example.createCriteria();
        criteria.andRedundancytwoEqualTo(uid+"");
        return newslistMapper.selectByExample(example);
    }

    @Override
    public int updateNewList(Newslist newslist) {
        return newslistMapper.updateByPrimaryKey(newslist);
    }

    @Override
    public Newslist getNewByTwo(int id) {
        return newslistMapper.selectByPrimaryKey(id);
    }
}
