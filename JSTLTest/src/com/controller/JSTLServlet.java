package com.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.Dept;

/*
 * 
 * 
 */
@WebServlet("/JSTLServlet")
public class JSTLServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setAttribute("username", "홍길동");
		
		List<String> list = Arrays.asList("홍길동","이순신","유관순");
		request.setAttribute("xyz", list);
		
		List<Dept> list2 = Arrays.asList(new Dept(10,"개발1", "서울1"),
		new Dept(20,"개발2", "서울2"),new Dept(30,"개발3", "서울3"));
		request.setAttribute("xyz2", list2);
		
		RequestDispatcher dis = request.getRequestDispatcher("exam01.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
