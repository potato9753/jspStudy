
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
<h3>Dept 자세히보기 화면</h3>
<form action="DeptUpdateController"  method="get">
<input type="hidden" name="deptno" value="${retrieve.deptno}">
 부서번호:${retrieve.deptno}<br>
 부서명:<input type="text" name="dname" value="${retrieve.dname}"><br>
 부서위치:<input type="text" name="loc" value="${retrieve.loc}"><br>
<input type="submit" value="수정">
</form>
<a href="DeptListController">목록</a>
<a href="DeptDeleteController?deptno=${retrieve.deptno }">삭제</a>

</body>
</html>