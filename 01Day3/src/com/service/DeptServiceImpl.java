package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.config.MySqlSessionFactory;
import com.dao.DeptDAO;
import com.dto.Dept;

public class DeptServiceImpl implements DeptService {
	DeptDAO dao;
	@Override
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Dept> list() {
		SqlSession session  = MySqlSessionFactory.getSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		}finally {
			session.close();
		}
		return list;
	}

	

}
