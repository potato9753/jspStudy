package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.User;

/**
 * Servlet implementation class MainController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		
		User user = new User(userid,passwd,"홍길동","서울"); // 없으면 User값이 null반환
		//User user = null; // 없으면 User값이 null반환
		if(user != null) {
			//세션에 저장 ==> HttpSession
			HttpSession session = request.getSession();
			session.setAttribute("login",user);
			
			response.sendRedirect("main.jsp");
		}else {
			response.sendRedirect("LoginUIController");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
