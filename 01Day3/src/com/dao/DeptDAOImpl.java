package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class DeptDAOImpl implements DeptDAO {

	@Override
	public List<Dept> selectAll(SqlSession session) {
		List<Dept> list = session.selectList("DeptMapper.selectAll");
		return list;
	}

}
