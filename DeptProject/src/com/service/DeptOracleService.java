package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.DBDao;
import com.dto.Dept;

/*
 *  Service 핵심작업 2가지
 *  1. 각 메서드안에서 SqlSession 얻고 close 한다.
 *  2. DAO에 SqlSession 전달
 *    (DAO는 서블릿에서 객체생성후 Serive로 전달 )
 */
public class DeptOracleService implements DBService{

	//DAO 인터페이스 참조
	DBDao dao;
	
	@Override
	public void setDao(DBDao dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Dept> selectAll() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<Dept> list = null;
		try {
		  list = dao.selectAll(session);
		}finally {
			session.close();
		}
		return list;
	}
	@Override
	public int write(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSession();
		int num = 0;
		try {
			num = dao.write(session, dept);
			session.commit();
		}finally {
			session.close();
		}
		return num;
	}
	@Override
	public int deleteByDeptno(int deptno) {
		SqlSession session = MySqlSessionFactory.getSession();
		int num = 0;
		try {
			num = dao.deleteByDeptno(session, deptno);
			session.commit();
		}finally {
			session.close();
		}
		return num;
	}

	////////////////////////////////
	public void template() {
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			//DAO 연동
		}finally {
			session.close();
		}
	}
	///////////////////////////////////////////

	@Override
	public Dept retrieve(int deptno) {
		SqlSession session = MySqlSessionFactory.getSession();
		Dept xxx = null;
		try {
			xxx = dao.retrieve(session, deptno);
		}finally {
			session.close();
		}
		return xxx;
	}

	@Override
	public int update(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSession();
		int num = 0;
		try {
			num = dao.update(session, dept);
			session.commit();
		}finally {
			session.close();
		}
		return num;
	}

	
	
}




