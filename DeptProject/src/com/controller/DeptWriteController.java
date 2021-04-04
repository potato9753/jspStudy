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

import com.dao.DeptOracleDAO;
import com.dto.Dept;
import com.service.DBService;
import com.service.DeptOracleService;

/*
 *    method방식 2가지
 *    
 *    1. get방식 
 *     - 기본방식
 *     - 사용자가 입력한 파라미터(querystring)값이 URL에 보여진다.
 *     - 전달되는 파라미터 타입은 문자열만 가능
 *     - URL에 보이기 때문에 보안 취약
 *     - 새로고침시 재전송된다.
 *     
 *    2. post방식
 *     - 사용자가 입력한 파라미터(querystring)값이 URL에 안보인다.
 *     - 전달되는 파라미터 타입은 문자열 및 이미지등과 같은 바이너리 가능(파일업로드) 
 *     - URL에 안보이기 때문에 보안 향상
 *     - 새로고침시 경고창으로 재전송 여부확인
 *     - 한글 깨짐 ==> 한글처리 필수
 */
@WebServlet("/DeptWriteController")
public class DeptWriteController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		////////////////////////////////////////////
		String [] email = request.getParameterValues("email");
		System.out.println(Arrays.toString(email));
		//////////////////////////////////////////////
		
		

		System.out.println("DeptWriteController");
		// 파라미터 얻기
		String deptno = request.getParameter("deptno");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		System.out.println(deptno+"\t"+dname+"\t"+loc);
		
		//서비스 
		DBService service = new DeptOracleService();
		service.setDao(new DeptOracleDAO());
		
		int num = service.write(new Dept(Integer.parseInt(deptno), dname, loc));

		//jsp 요청위임==> 지금은 서블릿으로 redirect 요청
		response.sendRedirect("DeptListController");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}
