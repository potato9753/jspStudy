<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	System.out.println(request);
	String name = (String)request.getAttribute("username");
	System.out.println(name);
	out.print(name); // 브라우저에 출력
%>
<%
	String xxx= "유관순";
%>
Hello, 안녕하세요<br>
<%= name %><br>
<%= xxx %><br>
</body>
</html>