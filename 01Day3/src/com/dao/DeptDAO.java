package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public interface DeptDAO {
	public abstract List<Dept> selectAll(SqlSession session);
}
