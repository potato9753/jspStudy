package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyEncodingFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		//1. 요청시 처리
		System.out.println("MyEncodingFilter-요청처리");
		request.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
		//2. 응답시 처리
		System.out.println("MyEncodingFilter-응답처리");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

}
