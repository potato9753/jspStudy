<%@ page import="com.dto.Dept"%>
<%@ page import="java.util.List"%>
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
     List<Dept> list =
     (List<Dept>)request.getAttribute("list");
%>
<h3>Dept테이블 목록보기</h3>
<table border="1">
   <tr>
     <th>부서번호</th>
     <th>부서명</th>
   </tr>
<%
    for(Dept dept:list){
%>   
   <tr>
     <td><a href="DeptRetrieveController?deptno=<%= dept.getDeptno() %>"><%= dept.getDeptno() %></a></td>
     <td><%= dept.getDname() %></td>
   </tr>
<%
    }//end for
%>     
   
</table>
<a href="DeptWriteUIController">부서등록</a>
</body>
</html>











