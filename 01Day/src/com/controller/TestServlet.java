package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestServlet.doget");
		//JSP에게 요청 위임 2. => redirect 방식
		
		//request에 데이터 저장
		request.setAttribute("username", "홍길동");
		
		response.sendRedirect("info.jsp"); //URL이 변경된다.
		
		
	}

}
