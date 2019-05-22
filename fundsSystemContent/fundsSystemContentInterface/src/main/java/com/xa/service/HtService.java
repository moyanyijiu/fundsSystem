package com.xa.service;

import com.xa.pojo.Htadmin;

import java.util.List;

public interface HtService {

    List<Htadmin> getAllHta();

    Htadmin getOneAdm(int aid);

    boolean updAdm(Htadmin htadmin);

    List<Htadmin> getPage(int start,int end);

    boolean delAdm(int aid);
}
