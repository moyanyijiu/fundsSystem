package com.xa.service;
import java.util.List;
import javax.annotation.Resource;
import com.xa.mapper.DeptMapper;
import com.xa.mapper.TrainingtopicsMapper;
import com.xa.pojo.Dept;
import com.xa.pojo.Trainingtopics;
import org.springframework.stereotype.Service;

@Service
public class DeptServerImpl implements DeptServer{
	
	@Resource
	private DeptMapper deptMapper;

	@Resource
	private TrainingtopicsMapper trainMapper;
	@Override
	public List<Dept> getAllDept() {
		List<Dept> allDept = deptMapper.getAllDept();
		return allDept;
	}

	@Override
	public List<Trainingtopics> getAllTra() {


		List<Trainingtopics> trainingtopics = trainMapper.selectByExample(null);


		return trainingtopics;
	}
}
