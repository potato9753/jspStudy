package com.service;

import java.util.List;

import com.dao.DeptDAO;
import com.dto.Dept;

public interface DeptService {

	
	public abstract void setDao(DeptDAO dao);
	//목록보기
	public abstract List<Dept>  list();
}
