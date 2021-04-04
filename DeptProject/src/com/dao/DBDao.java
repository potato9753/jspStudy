package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public interface DBDao {

	public abstract List<Dept> selectAll(SqlSession session);
	
	public abstract int write(SqlSession session, Dept dept);
	
	public abstract Dept retrieve(SqlSession session, int deptno);
	
	public abstract int deleteByDeptno(SqlSession session, int deptno);
	
	public abstract int update(SqlSession session, Dept dept);
}
