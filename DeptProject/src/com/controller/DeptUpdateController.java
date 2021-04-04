package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DeptOracleDAO;
import com.dto.Dept;
import com.service.DBService;
import com.service.DeptOracleService;

/**
 * Servlet implementation class DeptUpdateController
 */
@WebServlet("/DeptUpdateController")
public class DeptUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//서비스
		DBService service = new DeptOracleService();
		service.setDao(new DeptOracleDAO());
		
		String deptno = request.getParameter("deptno");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		
		int num = service.update(new Dept(Integer.parseInt(deptno), dname, loc));

		//jsp 요청위임==> 지금은 서블릿으로 redirect 요청
		response.sendRedirect("DeptListController");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
