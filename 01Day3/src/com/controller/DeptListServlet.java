package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DeptDAOImpl;
import com.dto.Dept;
import com.service.DeptService;
import com.service.DeptServiceImpl;

/**
 * Servlet implementation class DeptListServlet
 */
@WebServlet("/DeptListServlet")
public class DeptListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
			DeptService service =  new DeptServiceImpl();
			service.setDao(new DeptDAOImpl());
			List<Dept> list = service.list();
			for (Dept xxx : list) {
				System.out.println(xxx);
			}
	
	}

}
