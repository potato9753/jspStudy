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
@WebServlet("/LogoutController")
public class LogoutController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("login");
		if(user!=null) {
			// 세션이 존재한 경우 삭제 ==> session.invalidate(), session.removeAttribute(key)
			session.invalidate();
			response.sendRedirect("main.jsp");
		}else {
			// 세션이 제거 ==> 로그인 유도
			response.sendRedirect("LoginUIController");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
