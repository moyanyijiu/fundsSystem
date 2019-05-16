package com.xa.service;
import java.util.List;
import javax.annotation.Resource;
import com.xa.mapper.DeptMapper;
import com.xa.pojo.Dept;
import org.springframework.stereotype.Service;

@Service
public class DeptServerImpl implements DeptServer{
	
	@Resource
	private DeptMapper deptMapper;
	@Override
	public List<Dept> getAllDept() {
		List<Dept> allDept = deptMapper.getAllDept();
		return allDept;
	}
}
