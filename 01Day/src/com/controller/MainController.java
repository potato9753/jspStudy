package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainController")
public class MainController extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("MainController.doGet");
		
		//request에 데이터 저장
		request.setAttribute("username", "이순신");
				
		//JSP에게 요청 위임 1. => forward 방식
		RequestDispatcher dis = request.getRequestDispatcher("info.jsp"); // URL 변경이 없다.
		dis.forward(request, response);
		
		
	}

}
