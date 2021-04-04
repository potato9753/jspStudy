package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request scope 저장
		request.setAttribute("request", "request");
		
		//session scope 저장
		HttpSession session = request.getSession();
		session.setAttribute("session", "session");
		
		//application scope 저장
		ServletContext ctx = getServletContext(); 
		ctx.setAttribute("application", "application");
		
		//forward
		RequestDispatcher dis = request.getRequestDispatcher("info.jsp");
		dis.forward(request,response);
		

		
		
	}

}
