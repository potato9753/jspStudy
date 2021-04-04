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
	String req = (String)request.getAttribute("request");
	String sess = (String)session.getAttribute("session");
	String app = (String)application.getAttribute("application");
%>
request: <%= req %><br>
session: <%= sess %><br>
application: <%= app %><br>
</body>
</html>