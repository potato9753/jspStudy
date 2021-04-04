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
<h3>값출력</h3>
${username }<br>
<h3>조건체크</h3>
<c:if test="${username == '홍길동' }">
	홍길동입니다.
</c:if>
<c:if test="${username != '홍길동' }">
	홍길동이 아닙니다.
</c:if>
<h3>반복문 - range</h3>
<c:forEach var="i" begin="1" end="10">
  ${i}<br>
</c:forEach>
<h3>반복문 - scope에 저장된 값 출력</h3>
<c:forEach var="m" items="${xyz}">
  ${m}<br>
</c:forEach>
<h3>반복문 - scope에 저장된 값 출력 및 status</h3>
<c:forEach var="m" items="${xyz}" varStatus="status">
  ${status.index}:${m}:${status.count}:${status.first}:${status.last}<br>
</c:forEach>
<h3>반복문 - List값 출력</h3>
<c:forEach var="m" items="${xyz2}">
  ${m.deptno}-${m.dname}-${m.loc}<br>
</c:forEach>
<h3>변수 저장</h3>
<c:set var="my" value="${username }" scope="application"/>
${my }<br>
</body>
</html>