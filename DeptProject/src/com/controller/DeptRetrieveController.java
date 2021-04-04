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


@WebServlet("/DeptRetrieveController")
public class DeptRetrieveController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DBService service = new DeptOracleService();
		service.setDao(new DeptOracleDAO());
		
		//파라미터 얻기
		String deptno = request.getParameter("deptno");
		
		Dept dept = service.retrieve(Integer.parseInt(deptno));
		System.out.println(dept);
		
		//scope 저장
		request.setAttribute("retrieve", dept);
		
		//jsp 요청위임
		RequestDispatcher dis = request.getRequestDispatcher("retrieve.jsp");
		dis.forward(request, response);
	}

}




