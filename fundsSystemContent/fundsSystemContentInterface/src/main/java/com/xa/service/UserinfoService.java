package com.xa.service;

import com.xa.pojo.Newslist;
import com.xa.pojo.Userinfo;

import java.util.List;

public interface UserinfoService {

    int inserUserInfo(Userinfo userinfo);

    Userinfo getUserINfoByuid(int uid);

    int insertNewlist(Newslist newslist);

    List<Newslist> getnewlist(int uid);

    int updateNewList(Newslist newslist);

    Newslist getNewByTwo(int re);

}
