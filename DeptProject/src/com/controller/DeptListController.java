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


@WebServlet("/DeptListController")
public class DeptListController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DBService service = new DeptOracleService();
		service.setDao(new DeptOracleDAO());
		
		List<Dept> list = service.selectAll();
		//데이터를 scope에 저장하고 jsp에서 사용한다.
		request.setAttribute("list", list);
		
		//jsp 요청위임
		RequestDispatcher dis = request.getRequestDispatcher("list.jsp");
		dis.forward(request, response);
	}

}
