<%@ page import="com.dto.Dept"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Dept테이블 목록보기</h3>
<table border="1">
   <tr>
     <th>부서번호</th>
     <th>부서명</th>
   </tr>
<c:forEach var="m" items="${list}" varStatus="status">
   <tr>
     <td><a href="DeptRetrieveController?deptno=${m.deptno }">${m.deptno }</a></td>
     <td>${m.dname }</td>
   </tr> 
</c:forEach>
</table>
<a href="DeptWriteUIController">부서등록</a>
</body>
</html>











