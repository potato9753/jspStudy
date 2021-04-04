package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class DeptOracleDAO implements DBDao {

	@Override
	public List<Dept> selectAll(SqlSession session) {
		return session.selectList("DeptMapper.selectAll");
	}

	@Override
	public int write(SqlSession session, Dept dept) {
		return session.insert("DeptMapper.write", dept);
	}

	@Override
	public Dept retrieve(SqlSession session, int deptno) {
		return session.selectOne("DeptMapper.selectByDeptno", deptno);
	}

	@Override
	public int deleteByDeptno(SqlSession session, int deptno) {
		
		return session.delete("DeptMapper.deleteByDeptno", deptno);
	}

	@Override
	public int update(SqlSession session, Dept dept) {
		return session.update("DeptMapper.update", dept);
	}

}
