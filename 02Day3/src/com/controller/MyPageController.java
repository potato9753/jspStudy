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
@WebServlet("/MyPageController")
public class MyPageController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//세션에 저장된 데이터 얻어서 jsp 보여주기
		//세션은 브라우저를 종료하지 않아도 일정시간(default-30분)이 지나면 제거된다. - 보안
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("login");
		if(user!=null) {
			// 세션이 존재한 경우
			response.sendRedirect("mypage.jsp");
		}else {
			// 세션이 제거 ==> 로그인 유도
			response.sendRedirect("LoginUIController");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
