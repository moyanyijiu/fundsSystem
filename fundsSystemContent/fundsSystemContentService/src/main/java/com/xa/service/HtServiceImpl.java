package com.xa.service;

import com.xa.mapper.HtadminMapper;
import com.xa.pojo.Htadmin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class HtServiceImpl implements HtService {

    @Resource
    private HtadminMapper happer;

    @Override
    public List<Htadmin> getAllHta() {

        List<Htadmin> htadmins = happer.selectByExample(null);

        return htadmins;
    }

    @Override
    public Htadmin getOneAdm(int aid) {

        Htadmin htadmin = happer.selectByPrimaryKey(aid);

        return htadmin;
    }

    @Override
    public boolean updAdm(Htadmin htadmin) {

        int i = happer.updateByPrimaryKey(htadmin);

        return i > 0;
    }

    @Override
    public List<Htadmin> getPage(int start, int end) {

        List<Htadmin> htadmins = happer.selectBypage(start, end);

        return htadmins;
    }

    @Override
    public boolean delAdm(int aid) {

        int i = happer.deleteByPrimaryKey(aid);

        return i > 0;
    }
}
