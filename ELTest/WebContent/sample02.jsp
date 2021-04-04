<%@page import="com.dto.Dept"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>이전방식</h3>
<%
	String xxx = (String)request.getAttribute("username");

%>
이름:<%=xxx %>

<h3>EL(Expression Language) 방식1</h3>
이름2:${username}<br>
이름2:${username2}<br>
이름2:${empty username2}<br>
<hr>
<h3>이전방식</h3>
<%
	Dept yyy = (Dept)request.getAttribute("dept");
%>
<%= yyy %> <br>
<%=yyy.getDeptno() %><br>
<%=yyy.getDname() %><br>
<%=yyy.getLoc() %><br>
<h3>EL(Expression Language) 방식2</h3>
${dept } <br>
${dept.deptno}<br>
${dept.dname}<br>
${dept.loc}<br>
</body>
</html>