package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.DBDao;
import com.dto.Dept;

public interface DBService {
	
	public abstract void setDao(DBDao dao);
	
	public abstract List<Dept> selectAll();
	
	public abstract int write(Dept dept);
	
	public abstract Dept retrieve(int deptno);
	
	public abstract int deleteByDeptno(int deptno);
	
	public abstract int update(Dept dept);
}
