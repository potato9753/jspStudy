package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DeptOracleDAO;
import com.dto.Dept;
import com.service.DBService;
import com.service.DeptOracleService;


@WebServlet("/DeptDeleteController")
public class DeptDeleteController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DBService service = new DeptOracleService();
		service.setDao(new DeptOracleDAO());
		
		//파라미터 얻기
		String deptno = request.getParameter("deptno");
		
		int num = service.deleteByDeptno(Integer.parseInt(deptno));
		System.out.println("삭제된 레코드 갯수:" + num);
		
		//jsp 요청 ===> 서블릿으로 재요청
		response.sendRedirect("DeptListController");
	}

}
